package com.javabasics.feb09;

import java.util.Scanner;

public class coupon {
    public static void main(String[] args) {
        int C1 = 12345;
        int C2 = 67890;
        boolean C1used = false;
        boolean C2used = false;

        Scanner s = new Scanner(System.in);

        for (int i = 1; i <= 2; i++) {

            int user_input = s.nextInt();

            if (user_input == C1) {
                if (C1used == false) {
                    System.out.println("accepted");
                    C1used = true;
                } else {
                    System.out.println("rejected");
                }

            } else if (user_input == C2) {
                if (C2used == false) {
                    System.out.println("accepted");
                    C2used = true;
                } else {
                    System.out.println("rejected");
                }

            } else {
                System.out.println("Invalid Coupon!");
            }
        }
    }
}

