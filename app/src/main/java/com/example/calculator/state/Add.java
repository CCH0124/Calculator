package com.example.calculator.state;

public class Add implements MathAlgorithm {
    @Override
    public double calculate(double a, double b){
        return a+b;
    }
}
