/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.foxmula.assignment1;

import java.util.Scanner;

/**
 *
 * @author Shrey
 */
class Stack{ 
    private int currsize;
    
    private class Node {
        int data;
        Node next;
    }
    Node top;

    Stack() {
        this.top = null;
        this.currsize=0;
    }
    public int getSize(){
        return currsize;
    }
    public void push(int x) {
        Node temp = new Node();
        if (temp == null) {
            System.out.println("Stack is full can't push more");
            return;
        }
        temp.data = x;
        temp.next = top;
        top = temp;
        currsize++;
    }

    public int pop() {
        if (top == null) {
            System.out.println("Stack is empty can't pop more");
            return 0;
        }
        int elepop = top.data;
        top = top.next;
        currsize--;
        return elepop;
    }

    public boolean isEmpty() {
        return top == null;
    }
        
    public static void main(String args[]) {
            Stack s1 = new Stack();
            Stack s2 = new Stack();
            Scanner sc = new Scanner(System.in);
            int ch;
            int data;
            while (true) {
                System.out.println("1. Push the data into stack 1");
                System.out.println("2. push the data into stack 2");
                System.out.println("3. pop the data from stack 1");
                System.out.println("4. pop the data from stack 2");
                System.out.println("Enter your choice");
                ch = sc.nextInt();
                switch (ch) {
                    case 1:
                        System.out.println("enter the data");
                        data = sc.nextInt();
                        s1.push(data);
                        if(s1.getSize()==s2.getSize()) System.out.println("the size is same of both of the stack");
                        break;
                    case 2:
                        System.out.println("enter the data");
                        data = sc.nextInt();
                        s2.push(data);
                        if(s1.getSize()==s2.getSize()) System.out.println("the size is same of both of the stack");
                        break;
                    case 3:
                        System.out.println("poped ele is "+s1.pop());
                        if(s1.getSize()==s2.getSize()) System.out.println("the size is same of both of the stack");
                        break;
                    case 4:
                        System.out.println("poped ele is "+s2.pop());
                        if(s1.getSize()==s2.getSize()) System.out.println("the size is same of both of the stack");
                        break;
                    default:
                        System.out.println("Sorry you entered a wrong choice ");
                }
            }
        }
    }
