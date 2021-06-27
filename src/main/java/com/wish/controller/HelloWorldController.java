package com.wish.controller;

import com.wish.domain.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @Autowired
    private Car car;

    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }
    @RequestMapping("/car")
    String car(){
        return car.toString();
    }
}
