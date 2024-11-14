package com.omarezzat;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Car car = (Car) context.getBean("carObj");
        Plane plane = (Plane) context.getBean("planeObj");
        car.save();
        plane.save();
        VehicleRepository vehicleRepository = (VehicleRepository) context.getBean("vehicleRepository");






    }
}