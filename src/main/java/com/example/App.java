package com.example;

import java.util.Scanner;

public class App 
{
    public static int add(int a, int b) {
        return a + b;
    }
    public static void main( String[] args ) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int a = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int b = scanner.nextInt();
        System.out.println("The sum of the two numbers is: " + add(a, b));

        scanner.close();
    }
}
