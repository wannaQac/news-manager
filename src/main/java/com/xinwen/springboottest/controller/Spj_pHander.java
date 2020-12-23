package com.xinwen.springboottest.controller;

import com.xinwen.springboottest.entity.Spj_p;
import com.xinwen.springboottest.reposity.Spj_preposity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/spj")
public class Spj_pHander {
    @Autowired
    private Spj_preposity spj_preposity;
    @GetMapping("/findAll")
    public List<Spj_p> findAll(){
        return spj_preposity.findAll();
    }
}
