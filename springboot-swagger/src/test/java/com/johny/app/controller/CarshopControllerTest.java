package com.johny.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

@SpringBootTest
public class CarshopControllerTest {

    @Autowired
    private CarshopController controller;

    @Test
    public void contextLoads() {
        assertThat(controller).isNotNull();
    }

}
