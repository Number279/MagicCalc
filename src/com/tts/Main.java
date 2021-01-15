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
        System.out.println("Enter the second number: ");
        double ans2 = sc.nextDouble();
        int o = 6;
        while(o > 5) {
            System.out.println("\nPlease enter the calculator function you would like to use:");
            System.out.println("\n+ for add, - for subtract, * for multiply, / for divide, ! for 1st number's factorial, or");
            System.out.println("sq for the first number squared,");
            System.out.println("root for the square root of the first number.");
            System.out.println("sin for sine of the first number.");
            System.out.println("cosin for cosine of the first number.");
            System.out.println("tan for the tangent of the first number.");
            System.out.println("pi for the first number multiplied by pi.");
            System.out.println("ln for the natural logarithm of the first number.");
            System.out.println("log for the log() of the first number");

            String mathFunc = sc.next();

            String a = mathFunc;
            switch (a) {
                case "+":
                    System.out.format("   %.2f%n + %.2f%n = " + Calculator.Add.addNum(ans1, ans2), ans1, ans2);
                    x = 4;
                    o = 4;
                    break;
                case "-":
                    System.out.format("   %.2f%n - %.2f%n = " + Calculator.Subtract.subNum(ans1, ans2), ans1, ans2);
                    x = 4;
                    o = 4;
                    break;
                case "*":
                    System.out.format("   %.2f%n x %.2f%n = " + Calculator.Multiply.multNum(ans1, ans2), ans1, ans2);
                    x = 4;
                    o = 4;
                    break;
                case "/":
                    System.out.format("   %.2f%n / %.2f%n = " + Calculator.Divide.divNum(ans1, ans2), ans1, ans2);
                    x = 4;
                    o = 4;
                    break;
                case "sq":
                    System.out.format("%.2f squared = " + Calculator.Power.powNum(ans1), ans1);
                    x = 4;
                    o = 4;
                    break;
                case "root":
                    System.out.format("The square root of %.2f  = " + Calculator.SqRoot.srNum(ans1), ans1);
                    x = 4;
                    o = 4;
                    break;
                case "sin":
                    System.out.format("The sin of %.2f degrees = " + Calculator.Sin.sinNum(ans1), ans1);
                    x = 4;
                    o = 4;
                    break;
                case "cosin":
                    System.out.format("The cosin of %.2f degrees = " + Calculator.Cosin.cosinNum(ans1), ans1);
                    x = 4;
                    o = 4;
                    break;
                case "tan":
                    System.out.format("The tan of %.2f degrees = " + Calculator.Tangent.tanNum(ans1), ans1);
                    x = 4;
                    o = 4;
                    break;
                case "!":
                    System.out.format("The factorial of %.2f  = " + Calculator.Factorial.facNum(ans1), ans1);
                    x = 4;
                    o = 4;
                    break;
                case "pi":
                    System.out.format("Pi( %.2f ) = " + Calculator.Pi.piNum(ans1), ans1);
                    x = 4;
                    o = 4;
                    break;
                case "ln":
                    System.out.format("Ln( %.2f ) = " + Calculator.Ln.lnNum(ans1), ans1);
                    x = 4;
                    o = 4;
                    break;
                case "log":
                    System.out.format("Log( %.2f ) = " + Calculator.Log.logNum(ans1), ans1);
                    x = 4;
                    o = 4;
                    break;
                default:
                    System.out.println("Please enter a valid operator.");
                    o = 9;
                    break;
            }
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
