package com.foxmula.assignment2;

import java.util.*;

public class Frequency {
    public static void main(String args[]){
        List<Integer> ls=new ArrayList<Integer>();
        System.out.println("Enter the no of ele you want too add");
        Scanner sc= new Scanner(System.in);
        Integer n = sc.nextInt();
        for(int i=0;i<n;i++){
            ls.add(sc.nextInt());
        }
        System.out.println("Frequency of each ele is :");
        HashSet<Integer>hs=new HashSet<Integer>(ls);
        for(Integer i:hs){
            System.out.println("Frequency of the element "+i+" is "+Collections.frequency(ls,i));
        }
    }
}
