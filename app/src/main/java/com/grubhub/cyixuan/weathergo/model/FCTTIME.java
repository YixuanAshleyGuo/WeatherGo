package com.grubhub.cyixuan.weathergo.model;

/**
 * Created by cyixuan on 2/11/17.
 */

public class FCTTIME {
    private String hour;
    private String hour_padded;
    private String min;
    private String sec;
    private String year;
    private String mon;
    private String mon_padded;
    private String mon_abbrev;
    private String mday;
    private String mday_padded;
    private String yday;
    private String isdst;
    private String epoch;
    private String pretty;
    private String civil;
    private String month_name;
    private String month_name_abbrev;
    private String weekday_name;
    private String weekday_name_night;
    private String weekday_name_abbrev;
    private String weekday_name_unlang;
    private String weekday_name_night_unlang;
    private String ampm;
    private String tz;
    private String age;

    public FCTTIME() {
    }

    public FCTTIME(String hour, String hour_padded, String min, String sec, String year, String mon, String mon_padded, String mon_abbrev, String mday, String mday_padded, String yday, String isdst, String epoch, String pretty, String civil, String month_name, String month_name_abbrev, String weekday_name, String weekday_name_night, String weekday_name_abbrev, String weekday_name_unlang, String weekday_name_night_unlang, String ampm, String tz, String age) {
        this.hour = hour;
        this.hour_padded = hour_padded;
        this.min = min;
        this.sec = sec;
        this.year = year;
        this.mon = mon;
        this.mon_padded = mon_padded;
        this.mon_abbrev = mon_abbrev;
        this.mday = mday;
        this.mday_padded = mday_padded;
        this.yday = yday;
        this.isdst = isdst;
        this.epoch = epoch;
        this.pretty = pretty;
        this.civil = civil;
        this.month_name = month_name;
        this.month_name_abbrev = month_name_abbrev;
        this.weekday_name = weekday_name;
        this.weekday_name_night = weekday_name_night;
        this.weekday_name_abbrev = weekday_name_abbrev;
        this.weekday_name_unlang = weekday_name_unlang;
        this.weekday_name_night_unlang = weekday_name_night_unlang;
        this.ampm = ampm;
        this.tz = tz;
        this.age = age;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public String getHour_padded() {
        return hour_padded;
    }

    public void setHour_padded(String hour_padded) {
        this.hour_padded = hour_padded;
    }

    public String getMin() {
        return min;
    }

    public void setMin(String min) {
        this.min = min;
    }

    public String getSec() {
        return sec;
    }

    public void setSec(String sec) {
        this.sec = sec;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMon() {
        return mon;
    }

    public void setMon(String mon) {
        this.mon = mon;
    }

    public String getMon_padded() {
        return mon_padded;
    }

    public void setMon_padded(String mon_padded) {
        this.mon_padded = mon_padded;
    }

    public String getMon_abbrev() {
        return mon_abbrev;
    }

    public void setMon_abbrev(String mon_abbrev) {
        this.mon_abbrev = mon_abbrev;
    }

    public String getMday() {
        return mday;
    }

    public void setMday(String mday) {
        this.mday = mday;
    }

    public String getMday_padded() {
        return mday_padded;
    }

    public void setMday_padded(String mday_padded) {
        this.mday_padded = mday_padded;
    }

    public String getYday() {
        return yday;
    }

    public void setYday(String yday) {
        this.yday = yday;
    }

    public String getIsdst() {
        return isdst;
    }

    public void setIsdst(String isdst) {
        this.isdst = isdst;
    }

    public String getEpoch() {
        return epoch;
    }

    public void setEpoch(String epoch) {
        this.epoch = epoch;
    }

    public String getPretty() {
        return pretty;
    }

    public void setPretty(String pretty) {
        this.pretty = pretty;
    }

    public String getCivil() {
        return civil;
    }

    public void setCivil(String civil) {
        this.civil = civil;
    }

    public String getMonth_name() {
        return month_name;
    }

    public void setMonth_name(String month_name) {
        this.month_name = month_name;
    }

    public String getMonth_name_abbrev() {
        return month_name_abbrev;
    }

    public void setMonth_name_abbrev(String month_name_abbrev) {
        this.month_name_abbrev = month_name_abbrev;
    }

    public String getWeekday_name() {
        return weekday_name;
    }

    public void setWeekday_name(String weekday_name) {
        this.weekday_name = weekday_name;
    }

    public String getWeekday_name_night() {
        return weekday_name_night;
    }

    public void setWeekday_name_night(String weekday_name_night) {
        this.weekday_name_night = weekday_name_night;
    }

    public String getWeekday_name_abbrev() {
        return weekday_name_abbrev;
    }

    public void setWeekday_name_abbrev(String weekday_name_abbrev) {
        this.weekday_name_abbrev = weekday_name_abbrev;
    }

    public String getWeekday_name_unlang() {
        return weekday_name_unlang;
    }

    public void setWeekday_name_unlang(String weekday_name_unlang) {
        this.weekday_name_unlang = weekday_name_unlang;
    }

    public String getWeekday_name_night_unlang() {
        return weekday_name_night_unlang;
    }

    public void setWeekday_name_night_unlang(String weekday_name_night_unlang) {
        this.weekday_name_night_unlang = weekday_name_night_unlang;
    }

    public String getAmpm() {
        return ampm;
    }

    public void setAmpm(String ampm) {
        this.ampm = ampm;
    }

    public String getTz() {
        return tz;
    }

    public void setTz(String tz) {
        this.tz = tz;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
