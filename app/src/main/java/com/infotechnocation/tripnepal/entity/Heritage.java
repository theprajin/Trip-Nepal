package com.infotechnocation.tripnepal.entity;

/**
 * Created by Prajin Bajracharya on 2/2/2017.
 */

public class Heritage {
    private String tilte;
    private String description;

    public Heritage() {
    }

    public Heritage(String tilte, String description) {
        this.tilte = tilte;
        this.description = description;
    }

    public String getTilte() {
        return tilte;
    }

    public void setTilte(String tilte) {
        this.tilte = tilte;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
