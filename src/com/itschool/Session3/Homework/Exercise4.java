package com.itschool.Session3.Homework;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Program that perform addition of two numbers!");
        System.out.println("Please enter first number : ");
        int firstNumber = scanner.nextInt();
        System.out.println("Please enter second number : ");
        int secondNumber = scanner.nextInt();
        System.out.println("The result of performing addition of " + firstNumber
                + " and " + secondNumber + " is " + (firstNumber + secondNumber));
    }
}
