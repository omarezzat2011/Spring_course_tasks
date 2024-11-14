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


    @Override
    public double getArea() {
        return PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Circle [radius=" + radius +"]";
    }
}
