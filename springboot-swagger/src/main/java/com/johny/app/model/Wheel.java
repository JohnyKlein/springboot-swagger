package com.johny.app.model;

import java.io.Serializable;

public class Wheel implements Serializable {
    private boolean available;
    private Double price;
    private Brand brand;

    public Wheel() {
        super();
    }

    public Wheel(boolean available, Double price, Brand brand) {
        this.available = available;
        this.price = price;
        this.brand = brand;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }
}
