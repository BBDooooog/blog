package com.bbdog.demo;

import java.util.LinkedHashMap;
import java.util.Map;

public interface IWeekday {

    public static final int SUN = 0;
    public static final String SUN_CAPTION = "星期一";

    public static final int MON = 1;
    public static final String MON_CAPTION = "星期二";

    public static final int TUE = 2;
    public static final String TUE_CAPTION = "星期三";

    public static final int WED = 3;
    public static final String WED_CAPTION = "星期四";

    public static final int THU = 4;
    public static final String THU_CAPTION = "星期五";

    public static final int FRI = 5;
    public static final String FRI_CAPTION = "星期六";

    public static final int SAT = 6;
    public static final String SAT_CAPTION = "星期天";

    public static final Map<Integer, String> WEEKDAY_MAP = new LinkedHashMap<Integer, String>(){
        {
            this.put(SUN,SUN_CAPTION);
            this.put(MON,MON_CAPTION);
            this.put(TUE,TUE_CAPTION);
            this.put(WED,WED_CAPTION);
            this.put(THU,THU_CAPTION);
            this.put(FRI,FRI_CAPTION);
            this.put(SAT,SAT_CAPTION);
        }
    };
}
