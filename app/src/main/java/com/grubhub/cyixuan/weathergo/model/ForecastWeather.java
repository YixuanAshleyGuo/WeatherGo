package com.grubhub.cyixuan.weathergo.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cyixuan on 2/11/17.
 */

public class ForecastWeather {
    private Response response;
    private String forecast_date;
    public List<ForecastdayTxt> forecastdayTxtList;
    public List<ForecastdaySimple> forecastdaySimpleList;

    public ForecastWeather() {
        forecastdayTxtList = new ArrayList<>();
        forecastdaySimpleList = new ArrayList<>();
    }

    public Response getResponse() {
        return response;
    }

    public void setResponse(Response response) {
        this.response = response;
    }

    public String getForecast_date() {
        return forecast_date;
    }

    public void setForecast_date(String forecast_date) {
        this.forecast_date = forecast_date;
    }

}
