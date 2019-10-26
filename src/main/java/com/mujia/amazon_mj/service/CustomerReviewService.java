package com.mujia.amazon_mj.service;

import com.mujia.amazon_mj.mapper.CustomerReviewMapper;
import com.mujia.amazon_mj.model.CustomerReview;
import com.mujia.amazon_mj.model.CustomerReviewExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

@Service
public class CustomerReviewService {
    @Autowired
    CustomerReviewMapper customerReviewMapper;
    public List<CustomerReview> getList(CustomerReview customerReview, String sortBy, String customerReviewBy) {
        CustomerReviewExample CustomerReviewExample = new CustomerReviewExample();
        if ("ASC".equals(customerReviewBy.toUpperCase())) {
            CustomerReviewExample.setOrderByClause(sortBy + " asc");
        } else {
            CustomerReviewExample.setOrderByClause(sortBy + " desc");
        }
        CustomerReviewExample.Criteria criteria = CustomerReviewExample.createCriteria();
        // 后期加入搜索条件
        return customerReviewMapper.selectByExample(CustomerReviewExample);
    }

//    public CustomerReview getOne(Long id) {
//        return customerReviewMapper.selectByPrimaryKey(id);
//    }


    public int insert(CustomerReview customerReview) {
        return customerReviewMapper.insertSelective(customerReview);
    }


//    public int update(CustomerReview customerReview) {
//        return customerReviewMapper.updateByPrimaryKeySelective(customerReview);
//    }
//
//
//    public int delete(CustomerReview customerReview) {
//        return customerReviewMapper.updateByPrimaryKeySelective(customerReview);
//    }

//    public boolean isExist(CustomerReview customerReview) {
//        CustomerReviewExample CustomerReviewExample = new CustomerReviewExample();
//        CustomerReviewExample.Criteria criteria = CustomerReviewExample.createCriteria();
//        if (!StringUtils.isEmpty(customerReview.getId())) {
//            criteria.andIdNotEqualTo(customerReview.getId());
//        }
//        return customerReviewMapper.countByExample(CustomerReviewExample) != 0 ? true : false;
//    }
}
