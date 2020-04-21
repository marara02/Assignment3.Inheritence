package com.company;

public class Square extends Rectangle {

    public Square() {
        super();
    }

    public Square(double a) {
        super(a, a);
    }

    public Square(double a, String color, boolean filled) {
        super(a, a, color, filled);
    }

    public void SetA(double length) {
        super.SetLength(length);
        super.SetWidth(length);
    }

    public double GetA() { return super.GetLength(); }

    @Override
    public String toString(){
        return "A square with side:" + GetA() + " " + "Subclass of:" + super.toString();
    }
    @Override
    public void SetLength(double length){
        SetA(length);
    }
    @Override
    public void SetWidth(double width){
        SetA(width);
    }
    @Override
    public double GetArea2(){
        double area = GetA() * GetA();
        return area;
    }
    public double GetPerimeter(){
        double perimeter = 4 * GetA();
        return perimeter;
    }

}
