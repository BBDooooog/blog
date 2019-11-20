package com.bbdog.demo.views.login.vo;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

@Data
@ToString
public class UserVo implements Serializable {

    private static final long serialVersionUID = 8342512942504971353L;

    private String username;
    private String password;
    private String confPassword;

}
