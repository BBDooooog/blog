package com.bbdog.demo.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class IdEntity implements Serializable {
    private static final long serialVersionUID = -2050502762316389392L;
    protected long id;
    protected int version;
}
