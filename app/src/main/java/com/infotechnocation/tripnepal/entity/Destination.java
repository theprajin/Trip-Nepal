package com.infotechnocation.tripnepal.entity;

import java.io.Serializable;

/**
 * Created by Prajin Bajracharya on 2/3/2017.
 */

public class Destination implements Serializable {

    private String titleDest;
    private String descDest;

    public Destination() {
    }

    public Destination(String titleDest, String descDest) {
        this.titleDest = titleDest;
        this.descDest = descDest;
    }

    public String getTitleDest() {
        return titleDest;
    }

    public void setTitleDest(String titleDest) {
        this.titleDest = titleDest;
    }

    public String getDescDest() {
        return descDest;
    }

    public void setDescDest(String descDest) {
        this.descDest = descDest;
    }
}
