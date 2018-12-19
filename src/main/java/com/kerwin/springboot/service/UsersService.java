package com.kerwin.springboot.service;

import com.kerwin.springboot.entity.Users;

/**
 * @ClassName: UsersService
 * @Description:
 * @version: v1.0.0
 * @Author: d.wang
 * @Date: 2018-12-11 13:37
 */
public interface UsersService
{
    void addUser(Users users);

    void deleteUser(Integer id);

    void updateUser(Users users);

    Users queryUser(Users user);
}
