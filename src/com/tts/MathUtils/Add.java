package com.tts.MathUtils;

public class Add {
    public double int1;
    public double int2;

    public Add() { };
    public Add(double int1, double int2){
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

    public double addNum(double int1, double int2){
        return int1 + int2;
    }

//    @Override
//    public String toString() {
//        return "Add{" +
//                "int1=" + int1 +
//                ", int2=" + int2 +
//                '}';
//    }
}
