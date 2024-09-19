package com.example.project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.text.DecimalFormat;


public class TipCalculator {


  public static String calculateTip(int people, int percent, double cost) {
        // DecimalFormat to round to two decimal places
        DecimalFormat df = new DecimalFormat("#.##");
        // Calculate tip and total amounts
        double tipAmount = cost * percent / 100;
        double totalBillWithTip = cost + tipAmount;
        double costPerPersonBeforeTip = cost / people;
        double tipPerPerson = tipAmount / people;
        double totalCostPerPerson = totalBillWithTip / people;

        // Create result StringBuilder to hold formatted output
        StringBuilder result = new StringBuilder();
        // Format and append the results to display
        result.append("Total bill before tip: $" + df.format(cost) + "\n");
        result.append("Total percentage: " + percent + "%\n");
        result.append("Total tip: $" + df.format(tipAmount) + "\n");
        result.append("Total Bill with tip: $" + df.format(totalBillWithTip) + "\n");
        result.append("Per person cost before tip: $" + df.format(costPerPersonBeforeTip) + "\n");
        result.append("Tip per person: $" + df.format(tipPerPerson) + "\n");
        result.append("Total cost per person: $" + df.format(totalCostPerPerson) + "\n");

        return result.toString();
    }

                                   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Collect number of people, tip percentage, and total cost
        System.out.print("Enter the number of people: ");
        int people = scanner.nextInt();

        System.out.print("Enter the tip percentage: ");
        int percent = scanner.nextInt();

        System.out.print("Enter the total cost before tip: ");
        double cost = scanner.nextDouble();


        // Display the results by calling calculateTip method
        System.out.println(calculateTip(people, percent, cost));

        scanner.close();

    }
}
