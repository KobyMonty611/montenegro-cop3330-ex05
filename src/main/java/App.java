/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Koby Montenegro
 */

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        System.out.print("What is the first number? ");
        Scanner scanner = new Scanner(System.in);
        int first = scanner.nextInt();

        System.out.print("What is the second number? ");
        int second = scanner.nextInt();

        int add = first + second;
        int subtract = first - second;
        int multiply = first * second;
        int divide = first / second;

        System.out.println(first + " + " + second + " = " + add);
        System.out.println(first + " - " + second + " = " + subtract);
        System.out.println(first + " * " + second + " = " + multiply);
        System.out.println(first + " / " + second + " = " + divide);

        scanner.close();
    }
}
