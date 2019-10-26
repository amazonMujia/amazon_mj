package com.mujia.amazon_mj.mapper;

import com.mujia.amazon_mj.model.KeywordsList;
import com.mujia.amazon_mj.model.KeywordsListExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface KeywordsListMapper {
    long countByExample(KeywordsListExample example);

    int deleteByExample(KeywordsListExample example);

    int deleteByPrimaryKey(Long id);

    int insert(KeywordsList record);

    int insertSelective(KeywordsList record);

    List<KeywordsList> selectByExample(KeywordsListExample example);

    KeywordsList selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") KeywordsList record, @Param("example") KeywordsListExample example);

    int updateByExample(@Param("record") KeywordsList record, @Param("example") KeywordsListExample example);

    int updateByPrimaryKeySelective(KeywordsList record);

    int updateByPrimaryKey(KeywordsList record);
}