package com.OOP;

import java.util.Scanner;

public class number10a {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.print("Input first number: ");
  int num1 = in.nextInt();
   
  System.out.print("Input second number: ");
  int num2 = in.nextInt();
   
  System.out.print("Input third number: ");
  int num3 = in.nextInt();
  
  double mean = num1 + num2 + num3 / 3;
  double variance = (Math.pow((num1-mean),2)+Math.pow((num2-mean),2)+Math.pow((num3-mean),2))/3;
  double standarddeviation = Math.sqrt((Math.pow(variance,2)));
  
  System.out.println("Average of this three numbers is: " + 
  mean);
  System.out.println("Variance of this three numbers is: " + variance);
  System.out.println("Standard deviation of this three number is: " + standarddeviation);
      }
}
