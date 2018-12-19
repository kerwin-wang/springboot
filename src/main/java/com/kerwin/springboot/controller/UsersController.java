package com.kerwin.springboot.controller;

import com.kerwin.springboot.entity.Users;
import com.kerwin.springboot.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: UserController
 * @Description:
 * @version: v1.0.0
 * @Author: d.wang
 * @Date: 2018-12-10 14:15
 */
@RestController
public class UsersController
{
    @Autowired
    private UsersService usersService;

//    @RequestMapping(value = "hello",method = RequestMethod.GET)
//    public User say(){
//        User user = new User();
//
//        user.setName("李六");
//        user.setPassword("123456");
//        user.setAge(18);
//        user.setBirthday(new Date());
//        user.setSex(2);
//        user.setDec(null);
//        return user;
//    }

    @RequestMapping("/queryUsers")
    public Users queryUsers(){
        Users users = new Users();
        users.setId(24);
        users.setUserId("1");
        return usersService.queryUser(users);
    }
}
