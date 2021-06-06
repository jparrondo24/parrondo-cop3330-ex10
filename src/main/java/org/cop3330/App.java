/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Justin Parrondo
 */

package org.cop3330;

import java.util.Scanner;

public class App {
    public static int subTotal(double[] prices, int[] quantities) {
        int subTotal = 0;
        for (int i = 0; i < prices.length; i++)
            subTotal += prices[i] * quantities[i];

        return subTotal;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double[] prices = new double[3];
        int[] quantities = new int[3];

        System.out.print("Enter the price of item 1: ");
        prices[0] = in.nextDouble();
        System.out.print("Enter the quantity of item 1: ");
        quantities[0] = in.nextInt();
        System.out.print("Enter the price of item 2: ");
        prices[1] = in.nextDouble();
        System.out.print("Enter the quantity of item 2: ");
        quantities[1] = in.nextInt();
        System.out.print("Enter the price of item 3: ");
        prices[2] = in.nextDouble();
        System.out.print("Enter the quantity of item 3: ");
        quantities[2] = in.nextInt();

        double subTotal = subTotal(prices, quantities);
        double tax = subTotal * 0.055;
        double total = subTotal + tax;

        String subTotalString = String.format("Subtotal: $%.2f", subTotal);
        String taxString = String.format("Tax: $%.2f", tax);
        String totalString = String.format("Total: $%.2f", total);

        System.out.println(subTotalString);
        System.out.println(taxString);
        System.out.println(totalString);
    }
}
