package com.foxmula.assignment2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.*;

public class TwoNumberSum {
    public static void main(String args[]) {
        List<Integer> ls = new ArrayList<Integer>();
        System.out.println("Enter the no of ele you want too add");
        Scanner sc = new Scanner(System.in);
        Integer n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            ls.add(sc.nextInt());
        }
        Collections.sort(ls);
        System.out.println("Enter the sum to find out the numbers");
        int k = sc.nextInt();
        int front= 0;
        int end= ls.size()-1;
        int flag=0;
        while(front<end) {
            int currsum = ls.get(front) + ls.get(end);
            if (currsum == k) {
                System.out.println("the two elements are " + ls.get(front) + " and " + ls.get(end));
                flag=1;
                break;
            } else {
                if (currsum < k) front++;
                else if (currsum > k) end--;
            }
        }
        if(flag==0) System.out.println("there is no pair whoes sum is present in list");
    }
}
