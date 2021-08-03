package com.bencer;


import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Principal: ");
        int principal = scanner.nextInt();

        System.out.println("Annual Interest Rate: ");
        float annualInterest = scanner.nextFloat();
        float monthlyInterest = (annualInterest/100)/12;

        System.out.println("Period (Years): ");
        int monthsPeriod = scanner.nextInt() * 12;

        double mortgage = principal *
                monthlyInterest * Math.pow((1+monthlyInterest),monthsPeriod) /
                Math.pow((1+monthlyInterest),monthsPeriod) - 1;

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);

        System.out.println(mortgageFormatted);
    }
}