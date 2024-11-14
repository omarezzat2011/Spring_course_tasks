package com.omarezzat;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Circle circle = (Circle) context.getBean("circleObj");
        circle.draw2d();
        circle.draw3d();
        Rectangle rectangle = (Rectangle) context.getBean("rectangleObj");
        rectangle.draw2d();
        rectangle.draw3d();



    }
}