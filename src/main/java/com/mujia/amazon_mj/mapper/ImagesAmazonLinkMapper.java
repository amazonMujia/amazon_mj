package com.mujia.amazon_mj.mapper;

import com.mujia.amazon_mj.model.ImagesAmazonLink;
import com.mujia.amazon_mj.model.ImagesAmazonLinkExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ImagesAmazonLinkMapper {
    long countByExample(ImagesAmazonLinkExample example);

    int deleteByExample(ImagesAmazonLinkExample example);

    int insert(ImagesAmazonLink record);

    int insertSelective(ImagesAmazonLink record);

    List<ImagesAmazonLink> selectByExample(ImagesAmazonLinkExample example);

    int updateByExampleSelective(@Param("record") ImagesAmazonLink record, @Param("example") ImagesAmazonLinkExample example);

    int updateByExample(@Param("record") ImagesAmazonLink record, @Param("example") ImagesAmazonLinkExample example);
}