package com.example.android3_lesson5_hw5_perizat;

import java.io.Serializable;

public class Basketball implements Serializable {
    String name;
    String image;
    String season;
    String description;

    public Basketball(String name, String image, String season, String description) {
        this.name = name;
        this.image = image;
        this.season = season;
        this.description=description;
    }

    public String getName() {
        return name;
    }

    public String getImage() {
        return image;
    }

    public String getSeason() {
        return season;
    }

    public String getDescription() {
        return description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
