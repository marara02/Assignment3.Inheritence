package com.company;

public class Shape {
    private String color;
    private boolean filled;

    public Shape() {
        color = "green";
        filled = true;
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public void SetShape(String color) {
        this.color = color;
    }

    public String isColor() {
        return color;
    }

    public void SetFilled(boolean filled) {
        this.filled = filled;
    }

    public boolean isFilled() {
        return filled;
    }

    public String toString() {
        if (isFilled() == true) {
            return "Shape with color" +" " + isColor() + " " + "and filled";
        } else {
            return "Shape with color" + " " + isColor() + " " + "but not filled";
        }
    }
}
