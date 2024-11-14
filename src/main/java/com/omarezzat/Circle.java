package com.omarezzat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Circle  implements Shape{
    private double radius;
    private final double PI=3.14;
    private Draw2d draw2d;
    private Draw3d draw3d;


    @Override
    public double getArea() {
        return PI * radius * radius;
    }

    @Override
    public void draw2d() {
        System.out.println( draw2d.draw()+"Circle");
    }

    @Override
    public void draw3d() {
        System.out.println( draw3d.draw()+"Circle");
    }

    @Override
    public String toString() {
        return "Circle [radius=" + radius +"]";
    }

}
