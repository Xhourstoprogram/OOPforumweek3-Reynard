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
  
  System.out.println("Average of three numbers is: " + 
  (num1 + num2 + num3) / 3);
      }
}
