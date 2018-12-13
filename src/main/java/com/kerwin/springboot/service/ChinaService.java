package com.kerwin.springboot.service;

import com.kerwin.springboot.entity.China;

import java.util.List;

/**
 * @ClassName: ChinaService
 * @Description:
 * @version: v1.0.0
 * @Author: d.wang
 * @Date: 2018-12-12 10:00
 */
public interface ChinaService
{
    List<China> getAllChina(int page,int pageSiz);
}
