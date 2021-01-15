package com.tts;

import com.tts.MathUtils.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 6;
        while (x > 5) {
        System.out.println("Enter the first number: ");
        double ans1 = sc.nextDouble();
        System.out.println("Enter another number: ");
        double ans2 = sc.nextDouble();
        System.out.println("Please enter the calculator function you would like to use.");
        System.out.println("\n+ for add, - for subtract, * for multiply, / for divide, or sq for square (1st input given)");
        String mathFunc = sc.next();

        String a = mathFunc;
        switch (a){
            case "+":
                System.out.format("   %.2f%n + %.2f%n = " + Calculator.Add.addNum(ans1,ans2), ans1, ans2);
                x=4;
                break;
            case "-":
                System.out.format("   %.2f%n - %.2f%n = " + Calculator.Subtract.subNum(ans1,ans2), ans1, ans2);
                x=4;
                break;
            case "*":
                System.out.format("   %.2f%n x %.2f%n = " + Calculator.Multiply.multNum(ans1,ans2), ans1, ans2);
                x=4;
                break;
            case "/":
                System.out.format("   %.2f%n / %.2f%n = " + Calculator.Divide.divNum(ans1,ans2), ans1, ans2);
                x=4;
                break;
            case "sq":
                System.out.format("%.2f squared = " +  Calculator.Power.powNum(ans1), ans1);
                x=4;
                break;
            default:
                System.out.println("Please enter a valid operator.");
                break;
        }
            int y = 6;
            while(y>5) {
            System.out.println("\nUse calculator again? (y/n)");
            String doagain = sc.next();
                if (doagain.equals("y")) {
                    x = 7;
                    y = 4;
                } else if (doagain.equals("n")) {
                    System.out.println("Program ended. Thank you for using Magic Calculator");
                    x = 4;
                    y = 4;
                } else {
                    System.out.println("Invalid response.  Please enter y for yes or n for no.");
                    y = 8;
                }
            }
            }
    }
}
