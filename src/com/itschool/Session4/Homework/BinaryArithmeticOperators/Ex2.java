package com.itschool.Session4.Homework.BinaryArithmeticOperators;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Program that calculates area of a rectangle!");

        System.out.println("Please enter the length : ");
        int firstNumber = scanner.nextInt();

        System.out.println("Please enter the breadth : ");
        int secondNumber = scanner.nextInt();

        calculateTheArea(firstNumber, secondNumber);
    }

    public static void calculateTheArea(int firstNumber, int secondNumber) {
        System.out.println("The area of the rectangle is : " + (firstNumber * secondNumber));
    }
}
