package com.example.demo;

import Service.CreateData;
import entities.Car;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.springframework.stereotype.Component;
import util.Podam;

@SpringBootApplication
public class DemoApplication {
    private static final Logger LOG = LoggerFactory.getLogger(DemoApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
        //Car car = Car.builder().id(1).brand("Mercedez").color("Red").price("120").build();
        Podam podam= new Podam();
        CreateData createData=new CreateData(podam);
        Car car=createData.generateDefaultCar();
        LOG.info(car.getColor());
    }

}
