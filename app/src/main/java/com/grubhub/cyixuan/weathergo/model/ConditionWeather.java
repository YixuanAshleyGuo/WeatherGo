package com.grubhub.cyixuan.weathergo.model;

/**
 * Created by cyixuan on 2/9/17.
 */

public class ConditionWeather {
    private Response response;
    private CurrentObservation currentObservation;

    public ConditionWeather() {
    }

    public ConditionWeather(Response response, CurrentObservation currentObservation) {
        this.response = response;
        this.currentObservation = currentObservation;
    }

    public Response getResponse() {
        return response;
    }

    public void setResponse(Response response) {
        this.response = response;
    }

    public CurrentObservation getCurrentObservation() {
        return currentObservation;
    }

    public void setCurrentObservation(CurrentObservation currentObservation) {
        this.currentObservation = currentObservation;
    }
}
