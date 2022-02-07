package com.javabasics.feb07;
/*
Basic Salary <= 10000 : HRA = 20%, DA = 80%
Basic Salary is between 10001 to 20000 : HRA = 25%, DA = 90%
Basic Salary >= 20001 : HRA = 30%, DA = 95%
 */
import java.util.Scanner;

public class ifelse {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int basic_salary = s.nextInt();

        double DA = 0, HRA = 0;
        double gross_salary = 0;

        if (basic_salary <= 10000){
            DA = (double)basic_salary * 0.8;
            HRA = (double) basic_salary * 0.2;
        }else if (basic_salary >= 10001 && basic_salary <= 20000){
            DA = (double)basic_salary * 0.9;
            HRA = (double)basic_salary * 0.25;
        } else if (basic_salary >= 20001){
            DA = (double)basic_salary * 0.95;
            HRA = (double)basic_salary * 0.3;
        }

        gross_salary = (double)basic_salary + HRA + DA;

        System.out.println(gross_salary);
    }

}
