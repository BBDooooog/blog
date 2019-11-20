package com.bbdog.demo.entity;

import lombok.Data;

import java.io.Serializable;
import java.sql.Date;

@Data
public class IdEntity implements Serializable {
    private static final long serialVersionUID = -2050502762316389392L;
    public Long id;
    public Integer version;
    private Date createTime;
    private Date updateTime;
}
