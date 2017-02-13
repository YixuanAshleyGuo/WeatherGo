package com.grubhub.cyixuan.weathergo.model;

/**
 * Created by cyixuan on 2/7/17.
 * this is the Image model, a field inside the CurrentObservation model
 */

public class Image {
    private String url;
    private String title;
    private String link;

    public Image() {
    }

    public Image(String url, String title, String link) {
        this.url = url;
        this.title = title;
        this.link = link;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
