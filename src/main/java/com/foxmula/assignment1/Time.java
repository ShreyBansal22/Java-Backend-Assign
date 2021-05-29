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
import java.util.*;
public class Time {
    private int hour;
    private int min;
    private int sec;
    Time(){
        hour=0;
        min=0;
        sec=0;
    }
    
    Time(int hour , int min, int sec){
        this.hour=hour;
        this.min=min;
        this.sec=sec;
    }
    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getSec() {
        return sec;
    }

    public void setSec(int sec) {
        this.sec = sec;
    }
    
   public void addTime(Time t){
      int sc=this.sec+t.getSec();
      int mn=this.min+t.getMin();
      int hr=this.hour+t.getHour();
      if(sc>60){
          sc-=60;
          mn+=1;
      }
      if(mn>60){
          mn-=60;
          hr+=1;
      }
      if(hr>24){
          hr-=24;
      }
      System.out.println(hr+"Hour"+mn+"Min"+sc+"Sec");
   }
public static void main(String []args){
    Time obj1= new Time(1,24,56);
    Time obj2= new Time(3,45,54);
    obj1.addTime(obj2);
    }
}
