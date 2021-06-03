package com.foxmula.assignment3;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;
public class FrequencySort {
    public static void main(String args[]){
        List<Integer>ls= new ArrayList<Integer>();
        HashMap<Integer,Integer>hm=new HashMap<Integer,Integer>();
        System.out.println("Enter the no of elements you want ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int [n];
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        //storing the elements with its frequency
        for(int x:arr) {
            int value = hm.getOrDefault(x, 0);
            hm.put(x, value + 1);
            ls.add(x);
        }
            ComparisonByValue comp=new ComparisonByValue(hm);
            Collections.sort(ls,comp);
            System.out.println("Elements sorted in ascending order of their frequency :");
            System.out.println(ls);
        }
    }
