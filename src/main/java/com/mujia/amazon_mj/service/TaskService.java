package com.mujia.amazon_mj.service;

import com.mujia.amazon_mj.mapper.TaskMapper;
import com.mujia.amazon_mj.model.Task;
import com.mujia.amazon_mj.model.TaskExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

@Service
public class TaskService {
    @Autowired
    TaskMapper taskMapper;
    public List<Task> getList(Task task, String sortBy, String taskBy) {
        TaskExample TaskExample = new TaskExample();
        if ("ASC".equals(taskBy.toUpperCase())) {
            TaskExample.setOrderByClause(sortBy + " asc");
        } else {
            TaskExample.setOrderByClause(sortBy + " desc");
        }
        TaskExample.Criteria criteria = TaskExample.createCriteria();
        // 后期加入搜索条件
        return taskMapper.selectByExample(TaskExample);
    }

//    public Task getOne(Long id) {
//        return taskMapper.selectByPrimaryKey(id);
//    }


    public int insert(Task task) {
        return taskMapper.insertSelective(task);
    }


    public int update(Task task) {
        return taskMapper.updateByPrimaryKeySelective(task);
    }


    public int delete(Task task) {
        return taskMapper.updateByPrimaryKeySelective(task);
    }

    public boolean isExist(Task task) {
        TaskExample TaskExample = new TaskExample();
        TaskExample.Criteria criteria = TaskExample.createCriteria();
        if (!StringUtils.isEmpty(task.getId())) {
            criteria.andIdNotEqualTo(task.getId());
        }
        return taskMapper.countByExample(TaskExample) != 0 ? true : false;
    }
}
