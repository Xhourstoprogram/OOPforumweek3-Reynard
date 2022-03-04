package com.OOP;

import java.util.Scanner;

public class number11 {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.print("Input first number: ");
  int num1 = in.nextInt();
   System.out.print("Input second number: ");
  int num2 = in.nextInt();
  System.out.println("Inputed Numbers = "+num1+", "+ + num2);
   num1 = num1 + num2;
   num2 = num1 - num2;
   num1 = num1 - num2;
   System.out.println("The Numbers have been swapped = "+num1+", "+ + num2);
}
}