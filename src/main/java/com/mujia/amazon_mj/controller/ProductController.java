package com.mujia.amazon_mj.controller;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.util.JSONPObject;
import com.mujia.amazon_mj.service.CustomerReviewService;
import com.mujia.amazon_mj.service.MainService;
import com.mujia.amazon_mj.service.SpecService;
import com.mujia.amazon_mj.service.TaskService;
import com.mujia.amazon_mj.util.responseMsg.Msg;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sun.jvm.hotspot.memory.Space;

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
    @PostMapping(value = "/mainProduct")
    public Msg ParentMain(@RequestBody JSONObject mainProduct){
        System.out.println(mainProduct);
        return Msg.success();
    }

    @GetMapping(value = "/index")
    public String ParentMain(){
        return "hello";
    }
}
