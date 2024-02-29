package com.itschool.Session3.Homework;

import java.util.Scanner;

public class Exercise4Enhance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Program that perform different operations on two numbers!");

        System.out.println("Please enter first number : ");
        int firstNumber = scanner.nextInt();

        System.out.println("Please enter second number : ");
        int secondNumber = scanner.nextInt();

        addition(firstNumber, secondNumber);
        subtraction(firstNumber, secondNumber);
        multiplication(firstNumber, secondNumber);
        division(firstNumber, secondNumber);

    }

    public static void addition (int firstNumber, int secondNumber) {
        System.out.println("The result of performing addition of " + firstNumber
                + " and " + secondNumber + " is " + (firstNumber + secondNumber));
    }

    public static void subtraction (int firstNumber, int secondNumber) {
        System.out.println("The result of performing subtraction of " + firstNumber
                + " and " + secondNumber + " is " + (firstNumber - secondNumber));
    }

    public static void multiplication (int firstNumber, int secondNumber) {
        System.out.println("The result of performing multiplication of " + firstNumber
                + " and " + secondNumber + " is " + (firstNumber * secondNumber));
    }

    public static void division (int firstNumber, int secondNumber) {
        System.out.println("The result of performing division of " + firstNumber
                + " and " + secondNumber + " is " + (firstNumber / secondNumber));
    }
}
