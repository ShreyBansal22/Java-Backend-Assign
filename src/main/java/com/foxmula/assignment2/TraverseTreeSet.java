package com.foxmula.assignment2;
import java.util.*;
public class TraverseTreeSet {
    public static void main(String args[]){
        TreeSet<Integer> hs=new TreeSet<Integer>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of elements yppu wish to add");
        int n=sc.nextInt();
        for(int i=0;i<n;i++) {
            hs.add(sc.nextInt());
        }
        Iterator<Integer>itr=hs.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
