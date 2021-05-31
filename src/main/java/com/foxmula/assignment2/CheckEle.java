package com.foxmula.assignment2;
import java.util.*;
public class CheckEle {
    public static void main(String args[]){
        ArrayList<Integer>ls=new ArrayList<Integer>();
        System.out.println("Enter 10 elements you want to enter");
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<10;i++){
            ls.add(sc.nextInt());
        }
        System.out.println("Enter the element you wish to search");
        Integer n=sc.nextInt();
        if(ls.contains(n)==true) System.out.println("Element found in the list at index "+ls.indexOf(n));
        else System.out.println("Element is not in the list");
    }
}
