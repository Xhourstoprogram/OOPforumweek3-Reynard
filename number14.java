package com.OOP;

import java.util.Scanner;

public class number14 {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.print("Input seconds: ");
		int seconds = in.nextInt(); 
        int second = seconds % 60;
        int hour = seconds / 60;
        int minute = hour % 60;
        hour = hour / 60;
        System.out.print(seconds + " seconds are " + hour + " hour, " + minute + " minute, and " + second + " seconds ");
		System.out.print("\n");
}
}