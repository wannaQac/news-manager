package com.xinwen.springboottest.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Spj_p {
    @Id
    private String pno;
    private String pname;
    private String color;

}
