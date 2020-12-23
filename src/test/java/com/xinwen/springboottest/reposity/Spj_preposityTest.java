package com.xinwen.springboottest.reposity;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class Spj_preposityTest {
    @Autowired
    private Spj_preposity spj_preposity;

    @Test
    void findAll(){
        System.out.println(spj_preposity.findAll());
    }
}