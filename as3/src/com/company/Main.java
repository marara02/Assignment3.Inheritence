package com.company;
//import java.util.*;
public class Main {

    public static void main(String[] args) {
     Shape ss = new Shape();
     Circle cc = new Circle();
     Rectangle rr = new Rectangle();
     Square sq = new Square();

        ss.SetShape("red");
        System.out.println(ss.isColor());
        ss.SetFilled(true);
        System.out.println(ss.toString());

        cc.SetRadius(2.5);
        System.out.println("Area of circle:" + cc.GetArea());
        System.out.println("Perimeter of circle:" + cc.GetPerimeter());
        System.out.println(cc.toString());

        rr.SetLength(5.0);
        rr.SetWidth(8.0);
        System.out.println(rr.GetArea2());
        System.out.println(rr.GetPerimeter2());
        System.out.println(rr.toString());

        sq.SetA(9.0);
        System.out.println(sq.GetA());
        System.out.println(sq.toString());
        System.out.println(sq.GetArea2());
        System.out.println(sq.GetPerimeter());
    }
}
