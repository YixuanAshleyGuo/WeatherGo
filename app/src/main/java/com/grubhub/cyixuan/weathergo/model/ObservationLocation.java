package com.grubhub.cyixuan.weathergo.model;

/**
 * Created by cyixuan on 2/8/17.
 * this is the observation_location model, a field inside current_observation model
 */

public class ObservationLocation {
    private String full;
    private String city;
    private String state;
    private String country;
    private String countryIso3166;
    private String latitude;
    private String longitude;
    private String elevation;

    public ObservationLocation() {
    }

    public ObservationLocation(String full, String city, String state, String country, String countryIso3166, String latitude, String longitude, String elevation) {
        this.full = full;
        this.city = city;
        this.state = state;
        this.country = country;
        this.countryIso3166 = countryIso3166;
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
