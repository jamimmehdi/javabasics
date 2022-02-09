package com.javabasics;

import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = s.nextInt();
        System.out.println("Enter second number: ");
        int b = s.nextInt();


        System.out.println("What operation you want to perform?: +, -, /, %, *, table");
        String operand = s.next();


        switch (operand) {
            case "+": {
                System.out.println(a + b);
                break;
            }
            case "-": {
                System.out.println(a - b);
                break;
            }
            case "*": {
                System.out.println(a * b);
                break;
            }
            case "/": {
                System.out.println(a / b);
                break;
            }
            case "%": {
                System.out.println(a % b);
                break;
            }
            case "table":{
                int n = s.nextInt();
                for (int i = 1; i <= 10; i++) {
                    System.out.println(n + " x " + i + " = "+n*i);
                }
                break;
            }
            default: {
                System.out.println("Enter a valid operand.");
            }
        }
    }
}
