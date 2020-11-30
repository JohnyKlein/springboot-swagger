package com.johny.app.controller;

import com.johny.app.enums.services.ServiceSdt;
import com.johny.app.model.Car;
import com.johny.app.model.CarShop;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarshopController {

    @PostMapping("/api/carshop")
    public CarShop getDocumentsResponse(@RequestBody Car car) {
        return CarShop.getByRequest(ServiceSdt.BY_CHARACTERISTICS.getUrlPath(), car);
    }

}
