package com.pluralsight;

import java.util.Scanner;

public class BasicCalculator {
    static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        // get two numbers
        System.out.print("Enter first number: ");
        int num1 = myScanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = myScanner.nextInt();
        myScanner.nextLine(); // eat leftover CRLF

        // Prompt calculation type
        System.out.println("Possible calculations:");
        System.out.println("   (A)dd");
        System.out.println("   (S)ubtract");
        System.out.println("   (M)ultiply");
        System.out.println("   (D)ivide");
        System.out.print("Please select an option: ");
        String calcType  = myScanner.nextLine();
        int numCalc = num1 * num2;
        System.out.println(num1 + " * " + num2 + " = " + numCalc);
    }
}
