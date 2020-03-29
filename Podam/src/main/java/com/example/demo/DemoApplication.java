package com.example.demo;

import entities.Car;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import uk.co.jemos.podam.api.PodamFactory;
import uk.co.jemos.podam.api.PodamFactoryImpl;

@SpringBootApplication
public class DemoApplication {
    private static final Logger LOG = LoggerFactory.getLogger(DemoApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
        //Car car = Car.builder().id(1).brand("Mercedez").color("Red").price("120").build();
        // Simplest scenario. Will delegate to Podam all decisions
        PodamFactory factory = new PodamFactoryImpl();
		Car myPojo = factory.manufacturePojo(Car.class);
        LOG.info(String.valueOf(myPojo.getColor()));
    }

}
