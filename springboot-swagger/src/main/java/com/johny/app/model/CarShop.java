package com.johny.app.model;

import com.johny.app.model.requests.util.RequestUtils;
import org.springframework.http.HttpEntity;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

public class CarShop {
    private String name;
    private String address;
    private Car car;

    public CarShop() {
        super();
    }

    public CarShop(String name, String address, Car car) {
        this.name = name;
        this.address = address;
        this.car = car;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public static CarShop getByRequest(String urlRequest, Car objectRequest) {
        CarShop carShop = new CarShop();
        try {
            HttpEntity<Car> request = new HttpEntity<>(objectRequest);
            RestTemplate restTemplate = RequestUtils.getRestTemplateWithoutSslVerification();
            carShop = restTemplate.postForObject(urlRequest, request, CarShop.class);
        } catch (RestClientException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return carShop;
    }
}
