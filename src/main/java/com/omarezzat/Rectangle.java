package com.omarezzat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class Rectangle implements Shape {
    private double width;
    private double length;
    private Draw2d draw2d;
    private Draw3d draw3d;

    public Rectangle(Draw2d draw2d, Draw3d draw3d) {
        this.draw2d = draw2d;
        this.draw3d = draw3d;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public void draw2d() {
        System.out.println( draw2d.draw()+"Rectangle");
    }

    @Override
    public void draw3d() {
        System.out.println(draw3d.draw()+"Rectangle");
    }


    @Override
    public String toString() {
        return "Rectangle [width=" + width + ", length=" + length + "]";
    }
}
