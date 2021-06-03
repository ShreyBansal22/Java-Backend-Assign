package com.foxmula.assignment3;
import java.util.*;
class CustomException extends Exception{
    public CustomException (String s){
        super(s);
    }
}
public class InvalidNumberCheck {

     static boolean isPrime(Integer x){
        int flag=0;
        for(int i=2;i<x/2;i++){
            if(x%i==0){
                flag=1;
                break;
            }
        }
        if(flag==0) return true;
        else return false;
    }

    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        try{
            System.out.println("Enter the number");
            Integer n= sc.nextInt();
            if(isPrime(n)&&(n%2!=0)){
                throw new CustomException("The number is prime and odd");
            }
            System.out.println("Wohoo!!the number is valid");
        } catch(CustomException ex) {
            System.out.println("Alert!Exception Caught");
            System.out.println(ex.getMessage());
        }
    }
}
