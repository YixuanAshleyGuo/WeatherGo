package com.grubhub.cyixuan.weathergo.model;

/**
 * Created by cyixuan on 2/11/17.
 */

public class ForecastdaySimple {
    private FCTTIME date;
    private String period;
    private WeatherReportUnit temp_high;
    private WeatherReportUnit temp_low;
    private String condition;
    private String icon;
    private String icon_url;
    private String skyicon;
    private String pop;
    private WeatherReportUnit qpf_allday;
    private WeatherReportUnit qpf_day;
    private WeatherReportUnit qpf_night;
    private WeatherReportUnit snow_allday;
    private WeatherReportUnit snow_day;
    private WeatherReportUnit snow_night;
    private WeatherReportUnit wind_max;
    private WeatherReportUnit wind_dir_max;
    private WeatherReportUnit wind_ave;
    private WeatherReportUnit wind_dir_ave;
    private String humidity_ave;
    private String humidity_max;
    private String humidity_min;

    public ForecastdaySimple() {
    }

    public ForecastdaySimple(FCTTIME date, String period, WeatherReportUnit temp_high, WeatherReportUnit temp_low, String condition, String icon, String icon_url, String skyicon, String pop, WeatherReportUnit qpf_allday, WeatherReportUnit qpf_day, WeatherReportUnit qpf_night, WeatherReportUnit snow_allday, WeatherReportUnit snow_day, WeatherReportUnit snow_night, WeatherReportUnit wind_max, WeatherReportUnit wind_dir_max, WeatherReportUnit wind_ave, WeatherReportUnit wind_dir_ave, String humidity_ave, String humidity_max, String humidity_min) {
        this.date = date;
        this.period = period;
        this.temp_high = temp_high;
        this.temp_low = temp_low;
        this.condition = condition;
        this.icon = icon;
        this.icon_url = icon_url;
        this.skyicon = skyicon;
        this.pop = pop;
        this.qpf_allday = qpf_allday;
        this.qpf_day = qpf_day;
        this.qpf_night = qpf_night;
        this.snow_allday = snow_allday;
        this.snow_day = snow_day;
        this.snow_night = snow_night;
        this.wind_max = wind_max;
        this.wind_dir_max = wind_dir_max;
        this.wind_ave = wind_ave;
        this.wind_dir_ave = wind_dir_ave;
        this.humidity_ave = humidity_ave;
        this.humidity_max = humidity_max;
        this.humidity_min = humidity_min;
    }

    public FCTTIME getDate() {
        return date;
    }

    public void setDate(FCTTIME date) {
        this.date = date;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public WeatherReportUnit getTemp_high() {
        return temp_high;
    }

    public void setTemp_high(WeatherReportUnit temp_high) {
        this.temp_high = temp_high;
    }

    public WeatherReportUnit getTemp_low() {
        return temp_low;
    }

    public void setTemp_low(WeatherReportUnit temp_low) {
        this.temp_low = temp_low;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getIcon_url() {
        return icon_url;
    }

    public void setIcon_url(String icon_url) {
        this.icon_url = icon_url;
    }

    public String getSkyicon() {
        return skyicon;
    }

    public void setSkyicon(String skyicon) {
        this.skyicon = skyicon;
    }

    public String getPop() {
        return pop;
    }

    public void setPop(String pop) {
        this.pop = pop;
    }

    public WeatherReportUnit getQpf_allday() {
        return qpf_allday;
    }

    public void setQpf_allday(WeatherReportUnit qpf_allday) {
        this.qpf_allday = qpf_allday;
    }

    public WeatherReportUnit getQpf_day() {
        return qpf_day;
    }

    public void setQpf_day(WeatherReportUnit qpf_day) {
        this.qpf_day = qpf_day;
    }

    public WeatherReportUnit getQpf_night() {
        return qpf_night;
    }

    public void setQpf_night(WeatherReportUnit qpf_night) {
        this.qpf_night = qpf_night;
    }

    public WeatherReportUnit getSnow_allday() {
        return snow_allday;
    }

    public void setSnow_allday(WeatherReportUnit snow_allday) {
        this.snow_allday = snow_allday;
    }

    public WeatherReportUnit getSnow_day() {
        return snow_day;
    }

    public void setSnow_day(WeatherReportUnit snow_day) {
        this.snow_day = snow_day;
    }

    public WeatherReportUnit getSnow_night() {
        return snow_night;
    }

    public void setSnow_night(WeatherReportUnit snow_night) {
        this.snow_night = snow_night;
    }

    public WeatherReportUnit getWind_max() {
        return wind_max;
    }

    public void setWind_max(WeatherReportUnit wind_max) {
        this.wind_max = wind_max;
    }

    public WeatherReportUnit getWind_dir_max() {
        return wind_dir_max;
    }

    public void setWind_dir_max(WeatherReportUnit wind_dir_max) {
        this.wind_dir_max = wind_dir_max;
    }

    public WeatherReportUnit getWind_ave() {
        return wind_ave;
    }

    public void setWind_ave(WeatherReportUnit wind_ave) {
        this.wind_ave = wind_ave;
    }

    public WeatherReportUnit getWind_dir_ave() {
        return wind_dir_ave;
    }

    public void setWind_dir_ave(WeatherReportUnit wind_dir_ave) {
        this.wind_dir_ave = wind_dir_ave;
    }

    public String getHumidity_ave() {
        return humidity_ave;
    }

    public void setHumidity_ave(String humidity_ave) {
        this.humidity_ave = humidity_ave;
    }

    public String getHumidity_max() {
        return humidity_max;
    }

    public void setHumidity_max(String humidity_max) {
        this.humidity_max = humidity_max;
    }

    public String getHumidity_min() {
        return humidity_min;
    }

    public void setHumidity_min(String humidity_min) {
        this.humidity_min = humidity_min;
    }
}
