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
class Parallelogram extends Quadrilateral {

    private int height;

    Parallelogram(int corX1, int corX2, int corY1, int corY2, int corX3, int corX4, int corY3, int corY4, int height) {
        super(corX1, corX2, corY1, corY2, corX3, corX4, corY3, corY4);
        this.height = height;
    }

    public int area(Parallelogram p) {
        int d1 = super.getLength(p.getX1(), p.getX2(), p.getY1(), p.getY2());
        return d1 * height;
    }
}
