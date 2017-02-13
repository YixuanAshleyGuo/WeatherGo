package com.grubhub.cyixuan.weathergo.model;

/**
 * Created by cyixuan on 2/7/17.
 * this is the model for the Response field in json result
 */

public class Response {
    private String version;
    private String termofService;
    private Features features;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getTermofService() {
        return termofService;
    }

    public void setTermofService(String termofService) {
        this.termofService = termofService;
    }

    public Features getFeatures() {
        return features;
    }

    public void setFeatures(Features features) {
        this.features = features;
    }
}
