package com.javabasics.feb07;

import java.util.Scanner;

public class electricitybill {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int unit_consumed = s.nextInt();

        double total = 0,  net_bill = 0, sur_charge = 0;


        if (unit_consumed <= 50)
            total = unit_consumed * 0.50;
        else if (unit_consumed > 50 && unit_consumed <= 150)
            total = (50 * 0.50) + ((unit_consumed - 50) * 0.75);
        else if (unit_consumed > 150 && unit_consumed <= 250)
            total = (50 * 0.50) + (100 * 0.75) + ((unit_consumed - 150) * 1.20);
        else if (unit_consumed > 250)
            total = (50 * 0.50) + (100 * 0.75) + (100 * 1.20) + ((unit_consumed - 250) * 1.50);

        sur_charge = total * 0.20;

        net_bill = total + sur_charge;

        System.out.println(net_bill);
    }
}
