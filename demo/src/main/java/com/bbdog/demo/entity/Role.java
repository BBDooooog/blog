package com.bbdog.demo.entity;


import lombok.Data;

import java.io.Serializable;

@Data
public class Role implements Serializable {
    private static final long serialVersionUID = 1966210151835451874L;
    private Integer id;

    private String name;

}