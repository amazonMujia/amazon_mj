package com.mujia.amazon_mj.controller;

import com.mujia.amazon_mj.model.Task;
import com.mujia.amazon_mj.service.TaskService;
import com.mujia.amazon_mj.util.responseMsg.Msg;
import com.mujia.amazon_mj.util.systemUtil.UserAgentGetter;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("/task")
@Api(
        value = "任务相关控制器",
        tags = "任务相关控制器"
)
public class TaskController {
    @Autowired
    TaskService taskService;
    @Autowired
    HttpServletRequest request;
    @GetMapping("/getTask")
    public Msg getTask(@RequestParam( "macAddress")String  macAddress){
        //macAddress
        Task task =new Task();
        task.setIp(macAddress);
        task.setStatus(0);
        List<Task> taskList=taskService.getList(task,"GetDate","");
        return Msg.success().add("taskList",taskList);
    }
}
