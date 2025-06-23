package com.durgasoft.calculator;

public class calculator {
    public static double add(double a, double b){
        return a+b;
    }
    public static double subtrack(double a, double b){
        return a-b;
    }
    public static double multiply(double a, double b){
        return a*b;
    }
    public static double divide(double a, double b){
        if(b==0){
            System.out.print("Error: Divide by zero is not allowed");
            return Double.NaN;
        }
        return a/b;
    }
}
