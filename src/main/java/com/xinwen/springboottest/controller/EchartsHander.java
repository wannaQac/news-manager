package com.xinwen.springboottest.controller;

import com.xinwen.springboottest.entity.Echarts;
import com.xinwen.springboottest.entity.Xinwen;
import com.xinwen.springboottest.reposity.Echartsreposity;
import com.xinwen.springboottest.reposity.Xinwenreposity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jmx.export.naming.IdentityNamingStrategy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("/echarts")
public class EchartsHander {
    @Autowired
    private Echartsreposity echartsreposity;
    @Autowired
    private Xinwenreposity xinwenreposity;

    @GetMapping("/findAll")
    public List<Echarts> findAll(){
        return echartsreposity.findAll();
    }

}
