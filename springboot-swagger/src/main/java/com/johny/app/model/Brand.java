package com.johny.app.model;

import java.io.Serializable;

public class Brand implements Serializable {
    private String name;
    private String nationality;

    public Brand() {
        super();
    }

    public Brand(String name, String nationality) {
        this.name = name;
        this.nationality = nationality;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
}
