package com.grubhub.cyixuan.weathergo.model;

/**
 * Created by cyixuan on 2/11/17.
 */

public class ConditionListInfo {
    private String character;
    private String value;

    public ConditionListInfo() {
    }

    public ConditionListInfo(String character, String value) {
        this.character = character;
        this.value = value;
    }

    public String getCharacter() {
        return character;
    }

    public void setCharacter(String character) {
        this.character = character;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
