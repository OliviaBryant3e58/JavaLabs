
import java.util.Scanner;

public class WhatOrder {
   
   public static <T extends Comparable<T>> Integer checkOrder(T i1, T i2, T i3, T i4) {
      
      if ((i1.compareTo(i2) < 0) && (i2.compareTo(i3) < 0) && (i3.compareTo(i4) < 0)) {
         return -1;
      }
      else if ((i4.compareTo(i3) < 0) && (i3.compareTo(i2) < 0) && (i2.compareTo(i1) < 0)) {
         return 1;
      }
      else {
         return 0;
      }
      
   }
   
   public static void main(String[] args) {
      
      Scanner scnr = new Scanner(System.in);
      
      System.out.println("Order: " + checkOrder(scnr.next(), scnr.next(), scnr.next(), scnr.next())); 
      
      System.out.println("Order: " + checkOrder(scnr.nextDouble(), scnr.nextDouble(), scnr.nextDouble(), scnr.nextDouble()));
      
   }
   
}
