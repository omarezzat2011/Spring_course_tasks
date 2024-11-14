package com.omarezzat;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Circle circle = (Circle) context.getBean("circle");
        circle.setRadius(3);
        System.out.println(circle +" It's Area " + circle.getArea());

        Rectangle rectangle = (Rectangle) context.getBean("rectangle");
        rectangle.setWidth(10);
        rectangle.setLength(5);
        System.out.println(rectangle +" It's Area " + rectangle.getArea());


    }
}