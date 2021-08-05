package com.bencer;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int principal = 0;
        while (principal <= 0) {
            System.out.println("Principal (>0): ");
            principal = scanner.nextInt();
            if (principal <= 0) {
                System.out.println("Invalid input!");
            }
        }

        float annualInterest = 0;
        float monthlyInterest = 0;
        while (annualInterest <= 0) {
            System.out.println("Annual Interest Rate (>0): ");
            annualInterest = scanner.nextFloat();
            if (annualInterest <= 0) {
                System.out.println("Invalid input!");
            } else {
                monthlyInterest = (annualInterest/100)/12;
            }

        }

        int monthsPeriod = 0;
        while (monthsPeriod <= 0) {
            System.out.println("Period (Years >0): ");
            monthsPeriod = scanner.nextInt();
            if (monthsPeriod <= 0) {
                System.out.println("Invalid input!");
            } else {
                monthsPeriod *= 12;
            }
        }


        double mortgage = principal *
                monthlyInterest * Math.pow((1+monthlyInterest),monthsPeriod) /
                Math.pow((1+monthlyInterest),monthsPeriod) - 1;

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);

        System.out.println(mortgageFormatted);
    }
}