package com.mujia.amazon_mj.mapper;

import com.mujia.amazon_mj.model.CustomerReview;
import com.mujia.amazon_mj.model.CustomerReviewExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CustomerReviewMapper {
    long countByExample(CustomerReviewExample example);

    int deleteByExample(CustomerReviewExample example);

    int insert(CustomerReview record);

    int insertSelective(CustomerReview record);

    List<CustomerReview> selectByExample(CustomerReviewExample example);

    int updateByExampleSelective(@Param("record") CustomerReview record, @Param("example") CustomerReviewExample example);

    int updateByExample(@Param("record") CustomerReview record, @Param("example") CustomerReviewExample example);
}