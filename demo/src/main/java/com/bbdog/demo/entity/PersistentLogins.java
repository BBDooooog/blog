package com.bbdog.demo.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;


@Data
public class PersistentLogins implements Serializable {
    private static final long serialVersionUID = -403791176197381337L;
    private String series;

    private String username;

    private String token;

    private Date lastUsed;


}