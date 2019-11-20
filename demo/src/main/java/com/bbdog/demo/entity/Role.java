package com.bbdog.demo.entity;


import lombok.Data;

import java.io.Serializable;

@Data
public class Role extends IdEntity implements Serializable {
    private static final long serialVersionUID = 1966210151835451874L;

    private String name;

}