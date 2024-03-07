package com.itschool.Session4.Homework.UnaryOperators;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Program that reverse the sign of an entered number!");

        System.out.println("Please enter the number : ");
        int number = scanner.nextInt();

        System.out.println("The number with reverse sign is " + -(number));
    }
}
