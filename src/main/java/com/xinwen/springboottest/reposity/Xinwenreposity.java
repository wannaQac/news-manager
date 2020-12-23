package com.xinwen.springboottest.reposity;

import com.xinwen.springboottest.entity.Xinwen;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Xinwenreposity extends JpaRepository<Xinwen,String> {

    List<Xinwen> findByRiqiLike(String riqi);
}
