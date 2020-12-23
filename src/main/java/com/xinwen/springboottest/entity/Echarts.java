package com.xinwen.springboottest.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Echarts {
    @Id
    private String yuefen;
    private int shuliang;

}
