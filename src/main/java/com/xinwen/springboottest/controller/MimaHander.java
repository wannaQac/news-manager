package com.xinwen.springboottest.controller;

import com.xinwen.springboottest.entity.Mima;
import com.xinwen.springboottest.entity.Xinwen;
import com.xinwen.springboottest.reposity.Mimareposity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/login")
public class MimaHander {
    @Autowired
    private Mimareposity mimareposity;

    @PostMapping("/yanzheng")
    public String login(@RequestBody Mima mima){
        String s = mima.getId();
/*        System.out.println(s);*/
       /* Mima mima1 = mimareposity.findById(s).get();*/
        /*mimareposity.save(mima);*/
        boolean flag = mimareposity.existsById(s);
        if(flag){
            return "success";
        }else{
            return "fail";
        }
    }

    @GetMapping("/findById/{id}")
    public Mima findById(@PathVariable("id") String id){
        return mimareposity.findById(id).get();
    }
}
