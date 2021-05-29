/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.foxmula.assignment1;

/**
 *
 * @author Shrey
 */
public class Quadrilateral {

    private int x1, x2, x3, x4, y1, y2, y3, y4;

    Quadrilateral() {
        x1 = 0;
        x2 = 0;
        x3 = 0;
        x4 = 0;
        y1 = 0;
        y2 = 0;
        y3 = 0;
        y4 = 0;

    }

    Quadrilateral(int x1, int x2, int x3, int x4, int y1, int y2, int y3, int y4) {
        this.x1 = x1;
        this.x2 = x2;
        this.x3 = x3;
        this.x4 = x4;
        this.y1 = y1;
        this.y2 = y2;
        this.y3 = y3;
        this.y4 = y4;
    }

    public int getLength(int x1, int x2, int y1, int y2) {
        int distance = (int) Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
        return distance;
    }

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getX3() {
        return x3;
    }

    public void setX3(int x3) {
        this.x3 = x3;
    }

    public int getX4() {
        return x4;
    }

    public void setX4(int x4) {
        this.x4 = x4;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    public int getY3() {
        return y3;
    }

    public void setY3(int y3) {
        this.y3 = y3;
    }

    public int getY4() {
        return y4;
    }

    public void setY4(int y4) {
        this.y4 = y4;
    }

    public static void main(String args[]) {
        Trapezoid t = new Trapezoid(10, 20, 10, 20, 30, 40, 50, 60, 4);
        Parallelogram p = new Parallelogram(10, 20, 10, 20, 30, 40, 50, 60, 4);
        Square s= new Square(10,20,10,20,30,40,30,40);
        Rectangle r= new Rectangle(10, 20, 10, 20, 30, 40, 50, 60);
        System.out.println("Area of Trapezoid is :" + t.area(t));
        System.out.println("Area of Parallelogram is :" + p.area(p));
        System.out.println("Area of Square is :" + s.area(s));
        System.out.println("Area of Rectangle:" + r.area(r));
    }
}






