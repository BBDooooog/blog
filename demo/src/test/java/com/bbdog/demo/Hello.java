package com.bbdog.demo;

public class Hello extends Lang{

    private String str;

    public Hello(String str){
        this.str = str;
    }
    public Hello(){};

    public int addNumber(int a, int b){
        return a + b;
    }
    public void getStr(){
        System.out.println("Hello:getStr");
    }
}
