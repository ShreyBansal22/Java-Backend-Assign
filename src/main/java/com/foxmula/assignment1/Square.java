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
    class Square extends Quadrilateral {
        Square(int corX1, int corX2, int corY1, int corY2, int corX3, int corX4, int corY3, int corY4) {
            super(corX1, corX2, corY1, corY2, corX3, corX4, corY3, corY4);
        }

        public int area(Square s) {
            int side = super.getLength(s.getX1(), s.getX2(), s.getY1(), s.getY2()); 
            return side * side;
        }
    }

