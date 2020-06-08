package com.touch.notes;

import java.sql.Time;

public class TimeStamp {
    private static String timeStamp;
    private String time;
    private String date;

    public TimeStamp(String time, String date){
        this.time = time;
        this.date = date;
    }

    public String getTimeStamp(){
        return time + " " + date;
    }

    public void setTimeStamp(String time, String date){
        this.time = time;
        this.date = date;
    }
}
