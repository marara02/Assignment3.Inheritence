package com.company;

public class Rectangle extends Shape {
    private double l;
    private double w;

    public Rectangle(){
        super();
        l = 1.0;
        w = 1.0;
    }
    public Rectangle(double length , double width){
        super();
        this.l = length;
        this.w = width;
    }
    public Rectangle(double length,double width,String color,boolean filled){
        super(color,filled);
        this.l = length;
        this.w = width;
    }
    public void SetLength(double l){this.l = l;}
    public double GetLength(){ return l;}

    public void SetWidth(double w){this.w = w;}
    public double GetWidth(){return w;}

    public double GetArea2(){
        double area = l * w;
        return  area;
    }
    public double GetPerimeter2(){
        double perimeter = 2 *(l + w);
        return perimeter;
    }
    @Override
    public String toString(){
        return "A rectangle with" + " " + GetWidth() + " " + "and with length" + " " + GetLength() + ".This is subclass of" + " " +super.toString();

    }
}
