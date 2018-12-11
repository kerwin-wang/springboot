package com.kerwin.springboot.controller;

import com.kerwin.springboot.entity.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @ClassName: UserController
 * @Description:
 * @version: v1.0.0
 * @Author: d.wang
 * @Date: 2018-12-10 14:15
 */
@RestController
public class UserController
{
    @RequestMapping(value = "hello",method = RequestMethod.GET)
    public User say(){
        User user = new User();

        user.setName("李六");
        user.setPassword("123456");
        user.setAge(18);
        user.setBirthday(new Date());
        user.setSex(2);
        user.setDec(null);
        return user;
    }
}
