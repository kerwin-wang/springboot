package com.kerwin.springboot.service.impl;

import com.kerwin.springboot.entity.User;
import com.kerwin.springboot.mapper.UserMapper;
import com.kerwin.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName: UserServiceImpl
 * @Description:
 * @version: v1.0.0
 * @Author: d.wang
 * @Date: 2018-12-19 10:52
 */
@Service
public class UserServiceImpl implements UserService
{
    @Autowired
    private UserMapper userMapper;

    @Override
//    @Transactional(propagation = Propagation.REQUIRED)
    public void updateUser(User user)
    {
        userMapper.deleteByPrimaryKey(4);

        int a = 1/0;

        userMapper.updateByPrimaryKeySelective(user);
    }
}
