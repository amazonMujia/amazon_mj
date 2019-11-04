package com.mujia.amazon_mj.service;

import com.mujia.amazon_mj.mapper.TaskMapper;
import com.mujia.amazon_mj.model.Main;
import com.mujia.amazon_mj.model.MainExample;
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
    public List<Task> getList(Task task, String sortBy, String orderBy) {
        TaskExample TaskExample = new TaskExample();
        if ("ASC".equals(orderBy.toUpperCase())) {
            TaskExample.setOrderByClause(sortBy + " asc");
        } else {
            TaskExample.setOrderByClause(sortBy + " desc");
        }
        TaskExample.Criteria criteria = TaskExample.createCriteria();
        if(!StringUtils.isEmpty(task.getIp())){
            criteria.andIpEqualTo(task.getIp());
        }
        if(!StringUtils.isEmpty(task.getStatus())){
            criteria.andStatusEqualTo(0);
        }

        // 后期加入搜索条件
        return taskMapper.selectByExample(TaskExample);
    }

//    public Task getOne(Long id) {
//        return taskMapper.selectByPrimaryKey(id);
//    }
    public Task TaskForASIN(String ASIN, Long mainId) {
        TaskExample taskExample=new TaskExample();
        TaskExample.Criteria criteria=taskExample.createCriteria();
        criteria.andAsinEqualTo(ASIN);
        criteria.andMainidEqualTo(mainId);
        taskExample.setOrderByClause("GetDate");
        List<Task> taskList=taskMapper.selectByExample(taskExample);
        if(StringUtils.isEmpty(taskList) || taskList.size()<1){
            return null;
        }else{
            return taskList.get(0);
        }

}


    public int insertForDate(List<Task> taskList) {
        int count=0;
//        for(Task task :taskList){
//            taskMapper.insertSelective(task);
//            count+=1;
//        }
//        return count;
        count=taskMapper.insertForDate(taskList);
        return count;
    }
    public int insertForDateTest(List<Task> taskList) {
        int count=0;
        for(Task task :taskList){
            taskMapper.insertSelective(task);
            count+=1;
        }
        return count;
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
