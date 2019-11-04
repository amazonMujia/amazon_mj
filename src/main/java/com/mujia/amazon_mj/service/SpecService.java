package com.mujia.amazon_mj.service;

import com.mujia.amazon_mj.mapper.SpecMapper;
import com.mujia.amazon_mj.model.Spec;
import com.mujia.amazon_mj.model.SpecExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

@Service
public class SpecService {
    @Autowired
    SpecMapper specMapper;
    public List<Spec> getList(Spec spec, String sortBy, String specBy) {
        SpecExample SpecExample = new SpecExample();
        if ("ASC".equals(specBy.toUpperCase())) {
            SpecExample.setOrderByClause(sortBy + " asc");
        } else {
            SpecExample.setOrderByClause(sortBy + " desc");
        }
        SpecExample.Criteria criteria = SpecExample.createCriteria();
        // 后期加入搜索条件
        return specMapper.selectByExample(SpecExample);
    }

//    public Spec getOne(Long id) {
//        return specMapper.selectByPrimaryKey(id);
//    }


    public int insert(Spec spec) {
        return specMapper.insertSelective(spec);
    }
    public int insertDataForAll(List<Spec> dataList) {
        int count = 0;
        for (Spec spec : dataList) {
            count += specMapper.insertSelective(spec);
        }
        return count;
    }


//    public int update(Spec spec) {
//        return specMapper.updateByPrimaryKeySelective(spec);
//    }


//    public int delete(Spec spec) {
//        return specMapper.updateByPrimaryKeySelective(spec);
//    }

//    public boolean isExist(Spec spec) {
//        SpecExample SpecExample = new SpecExample();
//        SpecExample.Criteria criteria = SpecExample.createCriteria();
//        if (!StringUtils.isEmpty(spec.getId())) {
//            criteria.andIdNotEqualTo(spec.getId());
//        }
//        return specMapper.countByExample(SpecExample) != 0 ? true : false;
//    }
}
