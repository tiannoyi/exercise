package com.qf.exercise.user.controller;


import com.qf.Base;
import com.qf.constan.StateCode;
import com.qf.exercise.user.entity.Test;
import com.qf.exercise.user.service.ITestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author xiongjun
 * @since 2020-01-22
 */
@RestController
@RequestMapping("/user-server/test")
public class TestController extends Base {

    @Autowired
    ITestService testService;

    @GetMapping("/getTest")
    public Object getTest(){
        List<Test> list = testService.list();
        return packaging(StateCode.SUCCESS,"测试成功",list);
    }

}
