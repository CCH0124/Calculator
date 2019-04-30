package com.example.calculator.state;

public class MathContext {
    private MathAlgorithm algorithm;

    public MathContext(MathAlgorithm strategy){
        this.algorithm = strategy;
    }

    public double execute(double num1, double num2){
        return algorithm.calculate(num1, num2);
    }
}
