package com.bencer;

import java.util.Objects;
import java.util.Scanner;

public class Exercises {
    public static void circleFormulae() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Radius: ");
        double numInput = scanner.nextDouble();

        System.out.println("Circumference is: " + 2*Math.PI*numInput + "\nArea is: " + Math.PI*Math.pow(numInput,2));
    }

    public static void mean() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers. Once done, enter 'fin'.");
        double total = 0;
        int elementCount = 0;
        String input = "";
        while (!Objects.equals(input, "fin")) {
            input = scanner.nextLine();
            if (Objects.equals(input, "fin")) {
                System.out.println("The mean is: " + total/elementCount );
            } else {
                try {
                    total += Double.parseDouble(input);
                    elementCount += 1;
                } catch(NumberFormatException exception) {
                    System.out.println("Invalid entry! Make sure it is a castable number.");
                }
            }
        }

    }

    public static void main(String[] args) {
        mean();
    }
}