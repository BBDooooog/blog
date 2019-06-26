package com.bbdog.demo.entity;

import lombok.Data;

import java.io.Serializable;
@Data
public class User implements Serializable {
    private static final long serialVersionUID = -1633999234150663177L;

    private Integer userId;
    private String userName;
    private String password;
    private String phone;
}