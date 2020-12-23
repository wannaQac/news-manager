package com.xinwen.springboottest.reposity;

import com.xinwen.springboottest.entity.Echarts;
import com.xinwen.springboottest.entity.Xinwen;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Echartsreposity extends JpaRepository<Echarts,String> {
}
