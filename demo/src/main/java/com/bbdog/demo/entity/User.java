package com.bbdog.demo.entity;

import lombok.Data;

import java.io.Serializable;
@Data
public class User extends IdEntity implements Serializable {
    private static final long serialVersionUID = -1633999234150663177L;

    private String loginName;
    private String name;
    private String password;
    private String phone;
}