package com.mujia.amazon_mj.mapper;

import com.mujia.amazon_mj.model.MainAtt1;
import com.mujia.amazon_mj.model.MainAtt1Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MainAtt1Mapper {
    long countByExample(MainAtt1Example example);

    int deleteByExample(MainAtt1Example example);

    int insert(MainAtt1 record);

    int insertSelective(MainAtt1 record);

    List<MainAtt1> selectByExample(MainAtt1Example example);

    int updateByExampleSelective(@Param("record") MainAtt1 record, @Param("example") MainAtt1Example example);

    int updateByExample(@Param("record") MainAtt1 record, @Param("example") MainAtt1Example example);
}