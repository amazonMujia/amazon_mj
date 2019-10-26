package com.mujia.amazon_mj.mapper;

import com.mujia.amazon_mj.model.RankList;
import com.mujia.amazon_mj.model.RankListExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RankListMapper {
    long countByExample(RankListExample example);

    int deleteByExample(RankListExample example);

    int deleteByPrimaryKey(Long id);

    int insert(RankList record);

    int insertSelective(RankList record);

    List<RankList> selectByExample(RankListExample example);

    RankList selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") RankList record, @Param("example") RankListExample example);

    int updateByExample(@Param("record") RankList record, @Param("example") RankListExample example);

    int updateByPrimaryKeySelective(RankList record);

    int updateByPrimaryKey(RankList record);
}