package com.omarezzat;

import com.omarezzat.config.Config;
import com.omarezzat.controller.BikeController;
import com.omarezzat.controller.CarController;
import com.omarezzat.controller.PlaneController;
import com.omarezzat.dao.DatabaseOperations;
import com.omarezzat.models.Bike;
import com.omarezzat.models.Car;
import com.omarezzat.models.Plane;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        // Test CarController (Constructor Injection)
        Car car = new Car();
        car.setBrand("Toyota");

        CarController carController = context.getBean(CarController.class);
        carController.saveVehicle(car);

        // Test PlaneController (Setter Injection)
        Plane plane = new Plane();
        plane.setBrand("Boeing");

        PlaneController planeController = context.getBean(PlaneController.class);
        planeController.saveVehicle(plane);

        // Test BikeController (Field Injection)
        Bike bike = new Bike();
        bike.setBrand("Harley-Davidson");

        BikeController bikeController = context.getBean(BikeController.class);
        bikeController.saveVehicle(bike);

        context.close();




    }
}