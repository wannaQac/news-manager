package com.xinwen.springboottest.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
@Data
public class Xinwen{
    @Id
    private String riqi;
    private String shenfen;
    private String shiqu;
    private String shijian;
    private String zhaiyao;
}
