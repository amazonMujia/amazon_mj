package com.mujia.amazon_mj.service;

import com.mujia.amazon_mj.mapper.MainMapper;
import com.mujia.amazon_mj.model.Main;
import com.mujia.amazon_mj.model.MainExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

@Service
public class MainService {
    @Autowired
    MainMapper mainMapper;
    public List<Main> getList(Main main, String sortBy, String mainBy) {
        MainExample MainExample = new MainExample();
        if ("ASC".equals(mainBy.toUpperCase())) {
            MainExample.setOrderByClause(sortBy + " asc");
        } else {
            MainExample.setOrderByClause(sortBy + " desc");
        }
        MainExample.Criteria criteria = MainExample.createCriteria();
        // 后期加入搜索条件
        return mainMapper.selectByExample(MainExample);
    }

    public Main getOne(Long id) {
        return mainMapper.selectByPrimaryKey(id);
    }


    public int insert(Main main) {
        return mainMapper.insertSelective(main);
    }


    public int update(Main main) {
        return mainMapper.updateByPrimaryKeySelective(main);
    }


    public int delete(Main main) {
        return mainMapper.updateByPrimaryKeySelective(main);
    }

    public boolean isExist(Main main) {
        MainExample MainExample = new MainExample();
        MainExample.Criteria criteria = MainExample.createCriteria();
        if (!StringUtils.isEmpty(main.getId())) {
            criteria.andIdNotEqualTo(main.getId());
        }
        return mainMapper.countByExample(MainExample) != 0 ? true : false;
    }
}
