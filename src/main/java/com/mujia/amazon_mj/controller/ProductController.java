package com.mujia.amazon_mj.controller;

import com.alibaba.fastjson.JSONObject;
import com.mujia.amazon_mj.model.CustomerReview;
import com.mujia.amazon_mj.model.Main;
import com.mujia.amazon_mj.model.Spec;
import com.mujia.amazon_mj.model.Task;
import com.mujia.amazon_mj.service.CustomerReviewService;
import com.mujia.amazon_mj.service.MainService;
import com.mujia.amazon_mj.service.SpecService;
import com.mujia.amazon_mj.service.TaskService;
import com.mujia.amazon_mj.util.responseMsg.Msg;
import com.mujia.amazon_mj.util.systemUtil.UserAgentGetter;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/product")
@Api(
        value = "产品相关控制器",
        tags = "产品相关控制器"
)
public class ProductController {
    @Autowired
    MainService mainService;
    @Autowired
    SpecService specService;
    @Autowired
    TaskService taskService;
    @Autowired
    CustomerReviewService customerReviewService;
    @Autowired
    private HttpServletRequest request;

    SimpleDateFormat formatter = new SimpleDateFormat( "yyyy-MM-dd HH:mm:ss");
    @Transactional
    @PostMapping(value = "/mainProduct")
    public Msg ParentMain(@RequestBody JSONObject mainProduct){
        Main main=new Main();
        if(StringUtils.isEmpty(mainProduct)
                ||(!mainProduct.containsKey("MainASIN"))
                ||(!mainProduct.containsKey("proName"))
                ||StringUtils.isEmpty(mainProduct.get("proName"))) {
            return Msg.fail();
        }
        //父类ASIN值
        main.setMainasin((String) mainProduct.get("MainASIN"));
        //商店名称
        if(!mainProduct.containsKey("ShopName") || StringUtils.isEmpty(mainProduct.get("ShopName"))){
            main.setShopname("无");
        }else{
            main.setShopname((String)mainProduct.get("ShopName"));
        }
        //城市
        if(!mainProduct.containsKey("Country") || StringUtils.isEmpty(mainProduct.get("Country"))){
            main.setCountry("无");
        }else{
            main.setCountry((String)mainProduct.get("Country"));
        }
        //评分
        if(!mainProduct.containsKey("rate") || StringUtils.isEmpty(mainProduct.get("rate"))){
            main.setRate(new BigDecimal(0));
        }else{
            main.setRate(new BigDecimal(mainProduct.get("rate").toString()));
        }
        //销量
        if(!mainProduct.containsKey("ratings") || StringUtils.isEmpty(mainProduct.get("ratings"))){
            main.setRatings(0);
        }else{
            main.setRatings(Integer.parseInt(((String) mainProduct.get("ratings")).replaceAll(",","")));
        }
        //评论数量
        if(!mainProduct.containsKey("CustomerReviews") || StringUtils.isEmpty(mainProduct.get("CustomerReviews"))){
            main.setCustomerreviews(0);
        }else{
            main.setCustomerreviews(Integer.parseInt(((String)mainProduct.get("CustomerReviews")).replaceAll(",","")));
        }
        //问答数量
        if(!mainProduct.containsKey("AnsweredQuestions") || StringUtils.isEmpty(mainProduct.get("AnsweredQuestions"))){
            main.setAnsweredquestions(0);
        }else{
            main.setAnsweredquestions(Integer.parseInt(((String)mainProduct.get("AnsweredQuestions")).replaceAll(",","")));
        }
        //卖点
        if(!mainProduct.containsKey("BriefIntro") || StringUtils.isEmpty(mainProduct.get("BriefIntro"))){
            main.setBriefintro("无");
        }else{
            main.setBriefintro((String)mainProduct.get("BriefIntro"));
        }
        //获取时间
        if(!mainProduct.containsKey("GetDate") || StringUtils.isEmpty(mainProduct.get("GetDate"))){
            main.setGetdate(new Date());
        }else{
            try{
                main.setGetdate(formatter.parse((String)mainProduct.get("GetDate")) );
            }catch (Exception e){
                Msg.fail().add("errorMsg","创建时间解析错误");
            }
        }
        //商品大类排名类型
        if(!mainProduct.containsKey("BigCategoryType") || StringUtils.isEmpty(mainProduct.get("BigCategoryType"))){
            main.setShopname("无");
        }else{
            main.setBigcategorytype((String)mainProduct.get("BigCategoryType"));
        }
        //商品大类排名名次
        if(!mainProduct.containsKey("BigCategoryType") || StringUtils.isEmpty(mainProduct.get("BigCategoryRank"))){
            main.setBigcategoryrank(0);
        }else{
            main.setBigcategoryrank(Integer.parseInt(((String) mainProduct.get("BigCategoryRank")).replaceAll(",","")));
        }
        //商品小类类排名类型
        if(!mainProduct.containsKey("BigCategoryType") || StringUtils.isEmpty(mainProduct.get("SmallCategoryType"))){
            main.setSmallcategorytype("无");
        }else{
            main.setSmallcategorytype((String)mainProduct.get("SmallCategoryType"));
        }
        //商品小类类排名名次
        if(!mainProduct.containsKey("BigCategoryType") || StringUtils.isEmpty(mainProduct.get("SmallCategoryRank"))){
            main.setSmallcategoryrank(0);
        }else{
            main.setSmallcategoryrank(Integer.parseInt(((String) mainProduct.get("SmallCategoryRank")).replaceAll(",","")));
        }
        //客户端ip
        String userIp="";
        if(!mainProduct.containsKey("macAddress") || StringUtils.isEmpty(mainProduct.get("macAddress"))){
            main.setMacaddress("无");
            userIp="无";
        }else{
            main.setMacaddress((String)mainProduct.get("macAddress"));
            userIp=main.getMacaddress();
        }
        //自增
        main.setUsername("wss");
        //创建父类产品
        int id=mainService.insert(main);
        Main mainForAsin=mainService.MainForASIN(main.getMainasin(),main.getMacaddress());

        // 创建任务
        System.out.println(mainProduct.get("proName"));
        if(!mainProduct.containsKey("proName") || StringUtils.isEmpty(mainProduct.get("proName"))){

        }else{
            List<String> proNameList=(List)mainProduct.get("proName");
            List<Task> taskList=new ArrayList<>();
            for(String asin : proNameList){
                Task task=new Task();
                task.setAsin(asin);
                task.setMainasin(main.getMainasin());
                task.setGetdate(new Date());
                task.setIp(userIp);
                task.setStatus(0);
                task.setMainid(mainForAsin.getId());
                taskList.add(task);
            }
            int count=taskService.insertForDateTest(taskList);
        }
        return Msg.success().add("mainId",mainForAsin.getId());
    }

    @Transactional
    @PostMapping(value = "/insertSpac")
    public Msg insertForSapc(@RequestBody JSONObject product){
        if(StringUtils.isEmpty(product)
                ||(!product.containsKey("ASIN"))
                ||StringUtils.isEmpty(product.get("ASIN"))
                ||(!product.containsKey("MainASIN"))
                ||StringUtils.isEmpty(product.get("MainASIN"))
                ||(!product.containsKey("mainId"))
                ||StringUtils.isEmpty(product.get("mainId"))) {
            return Msg.fail();
        }
        System.out.println(product.get("mainId"));
        int mainId=Integer.parseInt(product.get("mainId").toString());
        //修改任务状态
        Task task=taskService.TaskForASIN((String) product.get("ASIN"),
                Long.parseLong(product.get("mainId").toString()));
        if(task==null){
            return Msg.fail().add("errorMsg","当前产品"+product.get("ASIN")+"任务不存在");
        }
        task.setStatus(1);
        taskService.update(task);
        //创建产品
        Spec spec =new Spec();
        spec.setMainasinid(mainId);
        //产品ASIN
        spec.setAsin(product.get("ASIN").toString());
        spec.setMainasin((String)product.get("MainASIN"));
        //商店名称
        if(!product.containsKey("ShopName") || StringUtils.isEmpty(product.get("ShopName"))){
            spec.setShopname("无");
        }else{
            spec.setShopname((String)product.get("ShopName"));
        }
        //城市
        if(!product.containsKey("Country") || StringUtils.isEmpty(product.get("Country"))){
            spec.setCountry("无");
        }else{
            spec.setCountry((String)product.get("Country"));
        }
        //尺寸
        if(!product.containsKey("Size") || StringUtils.isEmpty(product.get("Size"))){
            spec.setSize("无");
        }else{
            spec.setSize((String) product.get("Size"));
        }
        //颜色
        if(!product.containsKey("Color") || StringUtils.isEmpty(product.get("Color"))){
            spec.setColor("无");
        }else{
            spec.setColor((String) product.get("Color"));
        }
        //产品原价
        if(!product.containsKey("Price") || StringUtils.isEmpty(product.get("Price"))){
            spec.setPrice(new BigDecimal(0));
        }else{
            spec.setPrice(new BigDecimal(product.get("Price").toString()));
        }
        //产品折扣价
        if(!product.containsKey("DealPrice") || StringUtils.isEmpty(product.get("DealPrice"))){
            spec.setDealprice(new BigDecimal(0));
        }else{
            spec.setDealprice(new BigDecimal(product.get("DealPrice").toString()));
        }
        //主图
        if(!product.containsKey("MainImage") || StringUtils.isEmpty(product.get("MainImage"))){
            spec.setMainimage("无");
        }else{
            spec.setMainimage((String) product.get("MainImage"));
        }
        //IsAmazonChoice
        if(!product.containsKey("IsAmazonChoice") || StringUtils.isEmpty(product.get("IsAmazonChoice"))){
            spec.setIsamazonchoice(0);
        }else{
            spec.setIsamazonchoice(Integer.parseInt((product.get("IsAmazonChoice").toString())));
        }
        //关键词：for AmazonChoice
        if(!product.containsKey("AmazonChoiceKeyword") || StringUtils.isEmpty(product.get("AmazonChoiceKeyword"))){
            spec.setAmazonchoicekeyword("无");
        }else{
            spec.setAmazonchoicekeyword((String) product.get("AmazonChoiceKeyword"));
        }
        //优惠数量
        if(!product.containsKey("PromotionNum") || StringUtils.isEmpty(product.get("PromotionNum"))){
            spec.setPromotionnum(0);
        }else{
            spec.setPromotionnum(Integer.parseInt((product.get("PromotionNum").toString())));
        }
        //优惠细节
        if(!product.containsKey("PromotionDetails") || StringUtils.isEmpty(product.get("PromotionDetails"))){
            spec.setPromotiondetails("无");
        }else{
            spec.setPromotiondetails((String) product.get("PromotionDetails"));
        }
        //大类排行
        if(!product.containsKey("BigCategoryRank") || StringUtils.isEmpty(product.get("BigCategoryRank"))){
            spec.setBigcategoryrank(0);
        }else{
            spec.setBigcategoryrank(Integer.parseInt(((String) product.get("BigCategoryRank")).replaceAll(",","")));
        }
        //小类排行
        if(!product.containsKey("SmallCategoryRank") || StringUtils.isEmpty(product.get("SmallCategoryRank"))){
            spec.setSmallcategoryrank(0);
        }else{
            spec.setSmallcategoryrank(Integer.parseInt(((String) product.get("SmallCategoryRank")).replaceAll(",","")));
        }
        //macAddress
        UserAgentGetter userAgentGetter=new UserAgentGetter(request);
        String userIp= userAgentGetter.getIpAddr();
        spec.setMacaddress(userIp);
        //客户端ip
        if(!product.containsKey("macAddress") || StringUtils.isEmpty(product.get("macAddress"))){
            spec.setMacaddress("无");
        }else{
            spec.setMacaddress((String)product.get("macAddress"));
        }
        //用户名
        spec.setUsername("wss");
        System.out.println("数据读取"+spec);
        int count=specService.insert(spec);
        if(count<1){
            return Msg.fail().add("errorMsg","数据插入失败");
        }
        //创建评论数
        CustomerReview customerReview=new CustomerReview();
        customerReview.setAsin(spec.getAsin());
        customerReview.setCreatedate(new Date());
        customerReview.setCountry(spec.getCountry());
        //1星评论
        if(!product.containsKey("Star1") || StringUtils.isEmpty(product.get("Star1"))){
            customerReview.setStar1(0);
        }else{
            customerReview.setStar1(Integer.parseInt(((String) product.get("Star1")).replaceAll(",","")));
        }
        //2星评论
        if(!product.containsKey("Star2") || StringUtils.isEmpty(product.get("Star2"))){
            customerReview.setStar2(0);
        }else{
            customerReview.setStar2(Integer.parseInt(((String) product.get("Star2")).replaceAll(",","")));
        }
        //3星评论
        if(!product.containsKey("Star3") || StringUtils.isEmpty(product.get("Star3"))){
            customerReview.setStar3(0);
        }else{
            customerReview.setStar3(Integer.parseInt(((String) product.get("Star3")).replaceAll(",","")));
        }
        //4星评论
        if(!product.containsKey("Star4") || StringUtils.isEmpty(product.get("Star4"))){
            customerReview.setStar4(0);
        }else{
            customerReview.setStar4(Integer.parseInt(((String) product.get("Star4")).replaceAll(",","")));
        }
        //5星评论
        if(!product.containsKey("Star5") || StringUtils.isEmpty(product.get("Star5"))){
            customerReview.setStar5(0);
        }else{
            customerReview.setStar5(Integer.parseInt(((String) product.get("Star5")).replaceAll(",","")));
        }
        customerReview.setCountry("test");
        customerReviewService.insert(customerReview);

        return Msg.success();
    }
}
