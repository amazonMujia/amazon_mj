package com.mujia.amazon_mj.mapper;

import com.mujia.amazon_mj.model.Main;
import com.mujia.amazon_mj.model.MainExample;
import java.util.List;

import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;

public interface MainMapper {
    long countByExample(MainExample example);

    int deleteByExample(MainExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Main record);
//    @Options(useGeneratedKeys = true,keyProperty = "id")
    int insertSelective(Main record);

    List<Main> selectByExample(MainExample example);

    Main selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Main record, @Param("example") MainExample example);

    int updateByExample(@Param("record") Main record, @Param("example") MainExample example);

    int updateByPrimaryKeySelective(Main record);

    int updateByPrimaryKey(Main record);
}