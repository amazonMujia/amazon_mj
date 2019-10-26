package com.mujia.amazon_mj.mapper;

import com.mujia.amazon_mj.model.MainFeatures;
import com.mujia.amazon_mj.model.MainFeaturesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MainFeaturesMapper {
    long countByExample(MainFeaturesExample example);

    int deleteByExample(MainFeaturesExample example);

    int insert(MainFeatures record);

    int insertSelective(MainFeatures record);

    List<MainFeatures> selectByExample(MainFeaturesExample example);

    int updateByExampleSelective(@Param("record") MainFeatures record, @Param("example") MainFeaturesExample example);

    int updateByExample(@Param("record") MainFeatures record, @Param("example") MainFeaturesExample example);
}