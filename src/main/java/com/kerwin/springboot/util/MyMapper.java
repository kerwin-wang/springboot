package com.kerwin.springboot.util;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @ClassName: MyMapper
 * @Description:
 * @version: v1.0.0
 * @Author: d.wang
 * @Date: 2018-12-11 10:44
 */
public interface MyMapper<T> extends Mapper, MySqlMapper
{
}
