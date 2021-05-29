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
class Trapezoid extends Quadrilateral {

    private int height;

    Trapezoid(int corX1, int corX2, int corY1, int corY2, int corX3, int corX4, int corY3, int corY4, int height) {
        super(corX1, corX2, corY1, corY2, corX3, corX4, corY3, corY4);
        this.height = height;
    }

    public int area(Trapezoid t) {
        int d1 = super.getLength(t.getX1(), t.getX2(), t.getY1(), t.getY2());
        int d2 = super.getLength(t.getX3(), t.getX4(), t.getY3(), t.getY4());
        return (int) ((d1 + d2) * height) / 2;
    }
}
