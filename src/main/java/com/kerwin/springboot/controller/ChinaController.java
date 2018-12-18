package com.kerwin.springboot.controller;

import com.kerwin.springboot.entity.China;
import com.kerwin.springboot.service.ChinaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName: ChinaController
 * @Description:
 * @version: v1.0.0
 * @Author: d.wang
 * @Date: 2018-12-12 10:00
 */
@RestController
public class ChinaController
{
    @Autowired
    private ChinaService chinaService;

    @RequestMapping(value = "/getChina")
    public Map<String, List<China>> getAllChina(Integer page)
    {

        Map<String, List<China>> map = new HashMap<>();

        if (page == null)
        {
            page = 1;
        }
        int pageSize = 10;
        //        China china = new China();

        List<China> chinas = chinaService.getAllChina(new China(),page,pageSize);

        map.put("data", chinas);
        return map;
    }

    @RequestMapping("/getChinaById")
    public China getChinaById(Integer id){
        return chinaService.getChinaById(id);
    }

}
