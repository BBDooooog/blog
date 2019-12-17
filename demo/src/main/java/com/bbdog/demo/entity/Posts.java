package com.bbdog.demo.entity;

import lombok.Data;

@Data
public class Posts extends IdEntity{
    private static final long serialVersionUID = -4693525770657818757L;
    private Long authorId;
    private String categorie;//分类
    private String context;//内容
    private String synopsis;//简介


    private String authorName;//作者名称
    private String reading;//阅读量
}
