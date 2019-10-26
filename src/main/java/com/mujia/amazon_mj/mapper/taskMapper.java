package com.mujia.amazon_mj.mapper;

import com.mujia.amazon_mj.model.task;
import com.mujia.amazon_mj.model.taskExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface taskMapper {
    long countByExample(taskExample example);

    int deleteByExample(taskExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(task record);

    int insertSelective(task record);

    List<task> selectByExample(taskExample example);

    task selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") task record, @Param("example") taskExample example);

    int updateByExample(@Param("record") task record, @Param("example") taskExample example);

    int updateByPrimaryKeySelective(task record);

    int updateByPrimaryKey(task record);
}