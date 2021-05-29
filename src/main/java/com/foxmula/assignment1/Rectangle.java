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
class Rectangle extends Quadrilateral {

    Rectangle(int corX1, int corX2, int corY1, int corY2, int corX3, int corX4, int corY3, int corY4) {
        super(corX1, corX2, corY1, corY2, corX3, corX4, corY3, corY4);
    }

    public int area(Rectangle r) {
        int d1 = super.getLength(r.getX1(), r.getX2(), r.getY1(), r.getY2());
        int d2 = super.getLength(r.getX3(), r.getX4(), r.getY3(), r.getY4());
        return (int) 2*(d1+d2);
    }
}