package com.bbdog.demo;

public enum Weekday {
    MON(1,"星期一"),
    TUE(2,"星期二"),
    WED(3,"星期三"),
    THU(4,"星期四"),
    FRI(5,"星期五"),
    SAT(6,"星期六"),
    SUN(0,"星期日");

    private final int sort;
    private final String caption;
    private Weekday(int sort, String caption){
        this.caption = caption;
        this.sort = sort;
    }

    public Weekday getBySort(int sort){
        Weekday result = null;
        for (Weekday weekday:Weekday.values()){
            if (weekday.sort == sort){
                result =  weekday;
            }else {
                throw new RuntimeException("没有该枚举类型");
            }
        }
        return result;
    }

    public Weekday getByCaption(String caption){
        Weekday result = null;
        for (Weekday weekday:Weekday.values()){
            if (weekday.caption.equals(caption)){
                result =  weekday;
            }else {
                throw new RuntimeException("没有该枚举类型");
            }
        }
        return result;
    }

    @Override
    public String toString(){
        return this.caption;
    }
}
