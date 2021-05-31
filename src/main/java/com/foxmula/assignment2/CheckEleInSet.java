package com.foxmula.assignment2;

import java.util.HashSet;
import java.util.Scanner;
public class CheckEleInSet {
    public static void main(String args[]){
        HashSet<Integer>hs=new HashSet<Integer>();
        System.out.println("Enter the  size of set");
        Scanner sc= new Scanner(System.in);
        Integer n=sc.nextInt();
        System.out.println("enter the elements:");
        for(int i=0;i<n;i++){
            hs.add(sc.nextInt());
        }
        System.out.println("Enter the element to search");
        Integer k=sc.nextInt();
        if(hs.contains(k))
        System.out.println("the ele is found in set");
        else System.out.println("element is not in the set");
    }
}
