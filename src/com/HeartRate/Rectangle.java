package com.HeartRate;

public class Rectangle { private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getArea(){
        double area=height*width;
        return area;
    }
    public double getPerimeter(){
        double perimeter=2*(height*width);
        return perimeter;
    }



}
