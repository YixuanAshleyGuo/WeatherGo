package com.grubhub.cyixuan.weathergo.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cyixuan on 2/11/17.
 */

public class HourlyWeather {
    private Response response;
    public List<HourlyForecast> hourlyForecastList;

    public HourlyWeather() {
        hourlyForecastList = new ArrayList<>();
    }

    public HourlyWeather(Response response, List<HourlyForecast> hourlyForecastList) {
        this.response = response;
        this.hourlyForecastList = hourlyForecastList;
    }

    public Response getResponse() {
        return response;
    }

    public void setResponse(Response response) {
        this.response = response;
    }

    public List<HourlyForecast> getHourlyForecastList() {
        return hourlyForecastList;
    }

    public void setHourlyForecastList(List<HourlyForecast> hourlyForecastList) {
        this.hourlyForecastList = hourlyForecastList;
    }
}
