package com.johny.app.model;

import java.io.Serializable;

public class Car implements Serializable {
    private String imagePath;
    private Double price;
    private String model;
    private Brand brand;
    private Wheel wheel;

    public Car() {
        super();
    }

    public Car(String imagePath, Double price, String model, Brand brand, Wheel wheel) {
        this.imagePath = imagePath;
        this.price = price;
        this.model = model;
        this.brand = brand;
        this.wheel = wheel;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }
}
