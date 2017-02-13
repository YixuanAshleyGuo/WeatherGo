package com.grubhub.cyixuan.weathergo.model;

/**
 * Created by cyixuan on 2/11/17.
 */

public class HourlyForecast {
    private FCTTIME fcttime;
    private WeatherReportUnit temp;
    private WeatherReportUnit dewpoint;
    private String condition;
    private String icon;
    private String icon_url;
    private String fctcode;
    private String sky;
    private WeatherReportUnit wspd;
    private WeatherReportUnit wdir;
    private String wx;
    private String uvi;
    private String humidity;
    private WeatherReportUnit windchill;
    private WeatherReportUnit heatindex;
    private WeatherReportUnit feelslike;
    private WeatherReportUnit qpf;
    private WeatherReportUnit snow;
    private String pop;
    private WeatherReportUnit mslp;

    public HourlyForecast() {
    }

    public HourlyForecast(FCTTIME fcttime, WeatherReportUnit temp, WeatherReportUnit dewpoint, String condition, String icon, String icon_url, String fctcode, String sky, WeatherReportUnit wspd, WeatherReportUnit wdir, String wx, String uvi, String humidity, WeatherReportUnit windchill, WeatherReportUnit heatindex, WeatherReportUnit feelslike, WeatherReportUnit qpf, WeatherReportUnit snow, String pop, WeatherReportUnit mslp) {
        this.fcttime = fcttime;
        this.temp = temp;
        this.dewpoint = dewpoint;
        this.condition = condition;
        this.icon = icon;
        this.icon_url = icon_url;
        this.fctcode = fctcode;
        this.sky = sky;
        this.wspd = wspd;
        this.wdir = wdir;
        this.wx = wx;
        this.uvi = uvi;
        this.humidity = humidity;
        this.windchill = windchill;
        this.heatindex = heatindex;
        this.feelslike = feelslike;
        this.qpf = qpf;
        this.snow = snow;
        this.pop = pop;
        this.mslp = mslp;
    }

    public FCTTIME getFcttime() {
        return fcttime;
    }

    public void setFcttime(FCTTIME fcttime) {
        this.fcttime = fcttime;
    }

    public WeatherReportUnit getTemp() {
        return temp;
    }

    public void setTemp(WeatherReportUnit temp) {
        this.temp = temp;
    }

    public WeatherReportUnit getDewpoint() {
        return dewpoint;
    }

    public void setDewpoint(WeatherReportUnit dewpoint) {
        this.dewpoint = dewpoint;
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

    public String getFctcode() {
        return fctcode;
    }

    public void setFctcode(String fctcode) {
        this.fctcode = fctcode;
    }

    public String getSky() {
        return sky;
    }

    public void setSky(String sky) {
        this.sky = sky;
    }

    public WeatherReportUnit getWspd() {
        return wspd;
    }

    public void setWspd(WeatherReportUnit wspd) {
        this.wspd = wspd;
    }

    public WeatherReportUnit getWdir() {
        return wdir;
    }

    public void setWdir(WeatherReportUnit wdir) {
        this.wdir = wdir;
    }

    public String getWx() {
        return wx;
    }

    public void setWx(String wx) {
        this.wx = wx;
    }

    public String getUvi() {
        return uvi;
    }

    public void setUvi(String uvi) {
        this.uvi = uvi;
    }

    public String getHumidity() {
        return humidity;
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }

    public WeatherReportUnit getWindchill() {
        return windchill;
    }

    public void setWindchill(WeatherReportUnit windchill) {
        this.windchill = windchill;
    }

    public WeatherReportUnit getHeatindex() {
        return heatindex;
    }

    public void setHeatindex(WeatherReportUnit heatindex) {
        this.heatindex = heatindex;
    }

    public WeatherReportUnit getFeelslike() {
        return feelslike;
    }

    public void setFeelslike(WeatherReportUnit feelslike) {
        this.feelslike = feelslike;
    }

    public WeatherReportUnit getQpf() {
        return qpf;
    }

    public void setQpf(WeatherReportUnit qpf) {
        this.qpf = qpf;
    }

    public WeatherReportUnit getSnow() {
        return snow;
    }

    public void setSnow(WeatherReportUnit snow) {
        this.snow = snow;
    }

    public String getPop() {
        return pop;
    }

    public void setPop(String pop) {
        this.pop = pop;
    }

    public WeatherReportUnit getMslp() {
        return mslp;
    }

    public void setMslp(WeatherReportUnit mslp) {
        this.mslp = mslp;
    }
}
