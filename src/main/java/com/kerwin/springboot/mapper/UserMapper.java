package com.kerwin.springboot.mapper;

import com.kerwin.springboot.entity.User;
import com.kerwin.springboot.util.MyMapper;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper extends MyMapper<User> {
}