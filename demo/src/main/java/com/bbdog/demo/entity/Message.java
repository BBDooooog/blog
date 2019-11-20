package com.bbdog.demo.entity;

import lombok.Data;

@Data
public class Message extends IdEntity {

    private static final long serialVersionUID = 3797417628855372180L;

    private Long senderId;
    private Long receiverId;
    private String content;
    private String title;
    private Integer type;
}
