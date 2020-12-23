package com.xinwen.springboottest.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
@Data
public class Mima {
    @Id
    private String id;
    private String quanxian;
}
