package com.grubhub.cyixuan.weathergo.model;

/**
 * Created by cyixuan on 2/11/17.
 */

public class WeatherReportUnit {
    private String english_name;
    private String metric_name;
    private String english;
    private String metric;

    public WeatherReportUnit() {
    }

    public WeatherReportUnit(String english_name, String english, String metric_name, String metric) {
        this.english_name = english_name;
        this.metric_name = metric_name;
        this.english = english;
        this.metric = metric;
    }

    public String getEnglish_name() {
        return english_name;
    }

    public void setEnglish_name(String english_name) {
        this.english_name = english_name;
    }

    public String getMetric_name() {
        return metric_name;
    }

    public void setMetric_name(String metric_name) {
        this.metric_name = metric_name;
    }

    public String getEnglish() {
        return english;
    }

    public void setEnglish(String english) {
        this.english = english;
    }

    public String getMetric() {
        return metric;
    }

    public void setMetric(String metric) {
        this.metric = metric;
    }
}

