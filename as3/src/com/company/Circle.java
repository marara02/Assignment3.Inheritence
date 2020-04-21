package com.company;

public class Circle extends Shape {
    private double radius;

    public Circle(){
        super();
        radius = 1.0;
    }
    public Circle(double radius){
        super();
        this.radius = radius;
    }
    public void SetRadius(double radius){ this.radius = radius;}
    public double GetRadius(){ return radius;}

    public double GetArea(){
        double area = Math.PI * Math.pow(radius,2);
        return area;
    }
    public double GetPerimeter(){
        double perimeter = 2 * Math.PI * radius;
        return perimeter;
    }
    @Override
    public String toString(){
        return "A circle with radius:" + GetRadius() + " "  +  "which is subclass of " + " " + super.toString();
    }
}
