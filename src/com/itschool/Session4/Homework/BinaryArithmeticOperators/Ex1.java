package com.itschool.Session4.Homework.BinaryArithmeticOperators;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Program that perform different operations on two numbers!");

        System.out.println("Please enter first number : ");
        int firstNumber = scanner.nextInt();

        System.out.println("Please enter second number : ");
        int secondNumber = scanner.nextInt();

        callMethods(firstNumber, secondNumber);
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

    public static void modulus (int firstNumber, int secondNumber) {
        System.out.println("The result of performing modulus of " + firstNumber
                + " and " + secondNumber + " is " + (firstNumber % secondNumber));
    }

    public static void callMethods (int firstNumber, int secondNumber) {
        addition(firstNumber, secondNumber);
        subtraction(firstNumber, secondNumber);
        multiplication(firstNumber, secondNumber);
        division(firstNumber, secondNumber);
        modulus(firstNumber, secondNumber);
    }
}
