package com.tts;

import com.tts.MathUtils.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        double ans1 = sc.nextDouble();
        System.out.println("Enter another number: ");
        double ans2 = sc.nextDouble();
        System.out.format("   %.2f%n + %.2f%n = " + Calculator.Add.addNum(ans1,ans2), ans1, ans2);

        System.out.println("\nEnter number: ");
        double ans3 = sc.nextDouble();
        System.out.println("Enter another number: ");
        double ans4 = sc.nextDouble();
        System.out.format("   %.2f%n - %.2f%n = " + Calculator.Subtract.subNum(ans3,ans4), ans3, ans4);

        System.out.println("\nEnter number: ");
        double ans5 = sc.nextDouble();
        System.out.println("Enter another number: ");
        double ans6 = sc.nextDouble();
        System.out.format("   %.2f%n x %.2f%n = " + Calculator.Multiply.multNum(ans5,ans6), ans5, ans6);
    }
}
