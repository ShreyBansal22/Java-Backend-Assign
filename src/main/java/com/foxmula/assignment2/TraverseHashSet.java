package com.foxmula.assignment2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class TraverseHashSet {
    public static void main(String args[]) {
        HashSet<Integer> hs = new HashSet<Integer>();
        System.out.println("Enter the  size of set");
        Scanner sc = new Scanner(System.in);
        Integer n = sc.nextInt();
        System.out.println("enter the elements:");
        for (int i = 0; i < n; i++) {
            hs.add(sc.nextInt());
        }
        System.out.println("Your hashset is :");
        Iterator<Integer> itr = hs.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
