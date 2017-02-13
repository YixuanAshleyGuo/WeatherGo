package com.grubhub.cyixuan.weathergo.model;

/**
 * Created by cyixuan on 2/7/17.
 * this is the DisplayLocation model, it is inside CurrentObservation model
 */

public class DisplayLocation {
    private String full;
    private String city;
    private String state;
    private String stateName;
    private String country;
    private String countryIso3166;
    private String zip;
    private String latitude;
    private String longitude;
    private String elevation;

    public DisplayLocation() {
    }

    public DisplayLocation(String full, String city, String state, String stateName, String country, String countryIso3166, String zip, String latitude, String longitude, String elevation) {
        this.full = full;
        this.city = city;
        this.state = state;
        this.stateName = stateName;
        this.country = country;
        this.countryIso3166 = countryIso3166;
        this.zip = zip;
        this.latitude = latitude;
        this.longitude = longitude;
        this.elevation = elevation;
    }

    public String getFull() {
        return full;
    }

    public void setFull(String full) {
        this.full = full;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountryIso3166() {
        return countryIso3166;
    }

    public void setCountryIso3166(String countryIso3166) {
        this.countryIso3166 = countryIso3166;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getElevation() {
        return elevation;
    }

    public void setElevation(String elevation) {
        this.elevation = elevation;
    }
}
