package com.kerwin.springboot.controller;

import com.kerwin.springboot.entity.User;
import com.kerwin.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName: UserController
 * @Description:
 * @version: v1.0.0
 * @Author: d.wang
 * @Date: 2018-12-19 10:51
 */
@RestController
public class UserController
{
    @Autowired
    private UserService userService;

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

    @RequestMapping(value = "/update",method = RequestMethod.GET)
    public void updateUser(){
        User user = new User();
        user.setId(3);
        user.setUserName("何三");
        user.setUserPassword("1324");

        userService.updateUser(user);
    }

//    @Scheduled(fixedRate = 3000)
    @Scheduled(cron = "1-14 * * * * ? ")
    public void schedule(){
        System.out.println("当前时间: "+dateFormat.format(new Date()));
    }
}
