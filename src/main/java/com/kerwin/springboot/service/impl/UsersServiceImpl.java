package com.kerwin.springboot.service.impl;

import com.kerwin.springboot.entity.Users;
import com.kerwin.springboot.mapper.UsersMapper;
import com.kerwin.springboot.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName: UserServiceImpl
 * @Description:
 * @version: v1.0.0
 * @Author: d.wang
 * @Date: 2018-12-11 13:39
 */
@Service
public class UsersServiceImpl implements UsersService
{
    @Autowired
    private UsersMapper usersMapper;

    @Override
    public void addUser(Users users)
    {
        usersMapper.insert(users);
    }

    @Override
    public void deleteUser(Integer id)
    {
        usersMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void updateUser(Users users)
    {
        usersMapper.deleteByPrimaryKey(2);

        usersMapper.updateByPrimaryKeySelective(users);
    }

    @Override
    public Users queryUser(Users user)
    {
        Users o = (Users) usersMapper.selectOne(user);
        System.out.println("users = "+o);
        return o;
    }
}
