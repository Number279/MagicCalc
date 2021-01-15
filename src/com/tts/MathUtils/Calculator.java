package com.tts.MathUtils;
import java.util.*;

public class Calculator {

    public static class Add {
         static public double addNum(double int1, double int2) {
            return int1 + int2;
        }
    }

    public static class Subtract {
        public static double subNum(double int1, double int2) {
            return int1 - int2;
        }
    }

    public static class Multiply {
        public static double multNum(double int1, double int2) {
            return int1 * int2;
        }
    }

    public static class Divide {
        public static double divNum(double int1, double int2) {
            return int1 / int2;
        }
    }

    public static class Power {
        public static double powNum(double int1) {
            return Math.pow(int1, 2);
        }
    }

    public static class SqRoot {
        public static double srNum(double int1) {
            return Math.sqrt(int1);
        }
    }

    public static class Sin {
        public static double sinNum(double int1) {
            return Math.sin(Math.toRadians(int1));
        }
    }

    public static class Cosin {
        public static double cosinNum(double int1) {
            return Math.cos(Math.toRadians(int1));
        }
    }

    public static class Tangent {
        public static double tanNum(double int1) {
            return Math.tan(Math.toRadians(int1));
        }
    }

    public static class Factorial {
        public static double facNum(double int1) {
            int res = 1, i;
            for (i=2; i<=int1; i++)
                res *= i;
            return res;
        }
    }
    public static class Pi {
        public static double piNum(double int1) {
           double res = int1 * 3.14159265358979323846;
           return res;
        }
    }

    public static class Ln {
        public static double lnNum(double int1) {
            double res = Math.log(int1);
            return res;
        }
    }

    public static class Log {
        public static double logNum(double int1) {
            double res = Math.log10(int1);
            return res;
        }
    }
}
