package com.mujia.amazon_mj.mapper;

import com.mujia.amazon_mj.model.Spec;
import com.mujia.amazon_mj.model.SpecExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SpecMapper {
    long countByExample(SpecExample example);

    int deleteByExample(SpecExample example);

    int insert(Spec record);

    int insertSelective(Spec record);

    List<Spec> selectByExample(SpecExample example);

    int updateByExampleSelective(@Param("record") Spec record, @Param("example") SpecExample example);

    int updateByExample(@Param("record") Spec record, @Param("example") SpecExample example);
}