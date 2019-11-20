package com.bbdog.demo.entity;

import lombok.Data;

import java.io.Serializable;
@Data
public class UserRole extends IdEntity implements Serializable {
    private static final long serialVersionUID = -6899729431209580408L;

    private Long userId;
    private Long roleId;
}
