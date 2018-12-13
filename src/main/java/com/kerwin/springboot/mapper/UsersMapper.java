package com.kerwin.springboot.mapper;

import com.kerwin.springboot.entity.Users;
import com.kerwin.springboot.util.MyMapper;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersMapper extends MyMapper<Users> {
}