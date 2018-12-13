package com.kerwin.springboot.service.impl;

import com.kerwin.springboot.entity.China;
import com.kerwin.springboot.mapper.ChinaMapper;
import com.kerwin.springboot.service.ChinaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName: ChinaServiceImpl
 * @Description:
 * @version: v1.0.0
 * @Author: d.wang
 * @Date: 2018-12-12 10:04
 */
@Service
public class ChinaServiceImpl implements ChinaService
{
    @Autowired
    private ChinaMapper chinaMapper;

    @Override
    public List<China> getAllChina()
    {
        return chinaMapper.selectAll();
    }
}
