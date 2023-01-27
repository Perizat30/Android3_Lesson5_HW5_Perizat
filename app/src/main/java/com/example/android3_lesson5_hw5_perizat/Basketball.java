package com.example.android3_lesson5_hw5_perizat;

import java.io.Serializable;

public class Basketball implements Serializable {
    String name;
    String image;
    String sezon;

    public Basketball(String name, String image, String sezon) {
        this.name = name;
        this.image = image;
        this.sezon = sezon;
    }

    public String getName() {
        return name;
    }

    public String getImage() {
        return image;
    }

    public String getSezon() {
        return sezon;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setSezon(String sezon) {
        this.sezon = sezon;
    }
}
