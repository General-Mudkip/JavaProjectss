package com.bencer;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.*;
import java.util.stream.Collectors;

public class Exercises {
    public static void circleFormulae() throws InputMismatchException {
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
        while (!input.equals("fin")) {
            input = scanner.nextLine();
            if (input.equals("fin")) {
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

    public static void areaOfPolygon() throws NumberFormatException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many sides are there?");
        double polygonSides = scanner.nextInt();
        System.out.println("What is the length of one of the sides?");
        double sideLength = scanner.nextInt();
        double area = (polygonSides*Math.pow(sideLength,2))/(4*Math.tan(Math.PI/polygonSides));
        System.out.println("The area of a " + (int)polygonSides + "-sided polygon with a side length of " + sideLength + " is " + area);
    }

    public static void stringReverser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String stringInput = scanner.nextLine();
        String[] stringToReverse = stringInput.split("");
        System.out.println(Arrays.toString(stringToReverse));
        String[] temp = new String[stringInput.length()];
        System.out.println(Arrays.toString(temp));
        for (int i = 0; i<(stringInput.length()); i++) {
            temp[i] = stringToReverse[stringInput.length()-i-1];
        }
        String finalString = String.join("", temp);
        System.out.println(finalString);
    }

    public static void singleDoubleTripleIntegerAddition() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input an integer:");
        int numberInput = scanner.nextInt();
        System.out.println("The result of " + numberInput + " + " + numberInput*11 + " + " + numberInput*111 + " is " + (numberInput+numberInput*11+numberInput*111));
    }

    public static void main(String[] args) {
        singleDoubleTripleIntegerAddition();
    }
}