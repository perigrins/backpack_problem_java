package org.example;

import java.util.Scanner;

public class Main {
    private static Knapsack knapsack;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number if items:");
        int n = sc.nextInt();
        System.out.print("\nenter seed:");
        int s = sc.nextInt();
        System.out.print("\nenter capacity:");
        int c = sc.nextInt();

        Knapsack knapsack = new Knapsack(n, s, c);
        System.out.println("\n-------\n");
        knapsack.Generate();
        knapsack.Sorting();
        System.out.println("\nsorted:\n");
        System.out.print(knapsack.Show2());
        System.out.println("\n-------\n");
        System.out.println(knapsack.Fit());
        System.out.println("\nresult:\n");
        System.out.println(knapsack.Result());
    }
}