package com.xinwen.springboottest;

import com.xinwen.springboottest.entity.Xinwen;
import com.xinwen.springboottest.entity.Mima;
import com.xinwen.springboottest.reposity.Echartsreposity;
import com.xinwen.springboottest.reposity.Mimareposity;
import com.xinwen.springboottest.reposity.Xinwenreposity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;

@SpringBootTest
class SpringboottestApplicationTests {

    @Autowired
    private Xinwenreposity xinwenreposity;
    @Autowired
    private Mimareposity mimareposity;
    @Autowired
    private Echartsreposity echartsreposity;
    @Test
    void contextLoads() {
    }

    @Test
    void save(){
        Xinwen xinwen = new Xinwen();
        xinwen.setRiqi("20201223");
        xinwen.setShenfen("1");
        xinwen.setShijian("1");
        xinwen.setShiqu("1");
        Xinwen xinwen1 = xinwenreposity.save(xinwen);
        System.out.println(xinwen1);
    }
    @Test
    void findById(){
        Xinwen xinwen =xinwenreposity.findById("20200720").get();
        System.out.println(xinwen);
    }
    @Test
    void update(){
        Xinwen xinwen = new Xinwen();
        xinwen.setRiqi("20200720");
        xinwen.setShenfen("山东");
        xinwen.setShijian("青岛");
        xinwen.setShiqu("测试");
        Xinwen xinwen1 = xinwenreposity.save(xinwen);
        System.out.println(xinwen1);
    }

    @Test
    void delete(){
        xinwenreposity.deleteById("20200720");
    }
    @Test
    void findbyid(){
        Mima mima = mimareposity.findById("1808020316").get();
        System.out.println(mima);
    }
    @Test
    void test1(){
        System.out.println(echartsreposity.findAll());
    }
    @Test
    void test2(){
        boolean f = mimareposity.existsById("1808020316");
        System.out.println(f);
    }

}
