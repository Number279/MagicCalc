package com.tts.MathUtils;
import java.util.*;

public class Calculator {

//    public static class SquareNum {
//        public void main(String [] args)
//        {
//            Scanner sc = new Scanner(System.in);
//            System.out.print("Please enter a number: ");
//            int num = sc.nextInt();
//            System.out.println("Your squared number is: " + square(num));
//        }
//        public int square(int num)
//        {
//            return num * num;
//        }
//    }
    public static class Add {
        public double int1;
        public double int2;


        public Add() {
        }

        ;

        public Add(double int1, double int2) {
            this.int1 = int1;
            this.int2 = int2;
        }

        public double getInt1() {
            return int1;
        }

        public void setInt1(double int1) {
            this.int1 = int1;
        }

        public double getInt2() {
            return int2;
        }

        public void setInt2(double int2) {
            this.int2 = int2;
        }

        static public double addNum(double int1, double int2) {
            return int1 + int2;
        }


    }
    public static class Subtract {
        public double int1;
        public double int2;

        public Subtract() {
        };

        public Subtract(double int1, double int2) {
            this.int1 = int1;
            this.int2 = int2;
        }

        public double getInt1() {
            return int1;
        }

        public void setInt1(double int1) {
            this.int1 = int1;
        }

        public double getInt2() {
            return int2;
        }

        public void setInt2(double int2) {
            this.int2 = int2;
        }

        public static double subNum(double int1, double int2) {
            return int1 - int2;
        }


    }

    public static class Multiply {
        public double int1;
        public double int2;

        public Multiply() {
        };

        public Multiply(double int1, double int2) {
            this.int1 = int1;
            this.int2 = int2;
        }

        public double getInt1() {
            return int1;
        }

        public void setInt1(double int1) {
            this.int1 = int1;
        }

        public double getInt2() {
            return int2;
        }

        public void setInt2(double int2) {
            this.int2 = int2;
        }

        public static double multNum(double int1, double int2) {
            return int1 * int2;
        }


    }
}
