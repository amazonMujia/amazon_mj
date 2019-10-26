package com.mujia.amazon_mj.controller;

import com.mujia.amazon_mj.mapper.TaskMapper;
import com.mujia.amazon_mj.service.TaskService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/task")
@Api(
        value = "任务相关控制器",
        tags = "任务相关控制器"
)
public class TaskController {
    @Autowired
    TaskService taskService;
}
