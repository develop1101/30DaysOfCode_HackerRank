/******************************************************************************
** Objective
In this challenge, you'll work with arithmetic operators.

** Task
Given the meal price (base cost of a meal), tip percent (the percentage of the meal price being added as tip), 
and tax percent (the percentage of the meal price being added as tax) for a meal, find and print the meal's total cost.
** Note: 
Be sure to use precise values for your calculations, or you may end up with an incorrectly rounded result!

** Input Format
There are 3 lines of numeric input:
The first line has a double, \mealCost\ (the cost of the meal before tax and tip).
The second line has an integer, \tipPercent\ (the percentage of \mealCost\ being added as tip).
The third line has an integer, \taxPercent\ (the percentage of \mealCost\ being added as tax).

** Output Format
Print the total meal cost, where \totalCost\ is the rounded integer result of the entire bill
(\mealCost\ with added tax and tip).

** Sample Input **
---------------------------------------
12.00
20
8
----------------------------------------

** Sample Output **
----------------------------------------
15
----------------------------------------

**Explanation
Given:
  mealCost = 12, tipPercent = 20, taxPercent = 8
Calculations:
  tip = 12 * 0.2 = 2.4
  tax = 12 * 0.08 = 0.96
  totalCost = mealCost + tip + tax = 12 + 2.4 + 0.96 = 15.36
  round(totalCost) = 15
  
*********************************************************************************************/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the solve function below.
    static void solve(double meal_cost, int tip_percent, int tax_percent) {

        // calculate tip and tax
        double tip = meal_cost * tip_percent / 100;
        double tax = meal_cost * tax_percent / 100;
        
        // add meal cost, tip, and tax
        double total = meal_cost + tip + tax;
        // change to integer and rounded to the nearest dollar
        int finalTotal = (int) Math.round(total);
        
        // print the final total
        System.out.println(finalTotal);

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double meal_cost = scanner.nextDouble();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tip_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tax_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        solve(meal_cost, tip_percent, tax_percent);

        scanner.close();
    }
}
