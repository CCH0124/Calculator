package com.example.calculator.expression;

import android.util.Log;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.StringTokenizer;
import java.util.regex.Pattern;

import com.example.calculator.state.*;

public class ExpressionHandle {

    private StringBuilder strBuilder = new StringBuilder();

    public void handleDisplayExpression(String s) {
        strBuilder.insert(strBuilder.length(), s);
        /**
         * 避免重複的 0
         */
        if (strBuilder.length() >= 2 && strBuilder.charAt(0) == '0'){
            strBuilder.deleteCharAt(0);
        }
    }

    public String getExpression() {
        return strBuilder.toString();
    }

    public void clear() {

        strBuilder = new StringBuilder();
    }
    private static final int BRACKET = 0;
    private static final int PLUS = 1;
    private static final int SUB = 1;
    private static final int MUL = 2;
    private static final int DIV = 2;
    private static final String DELIM = "+-*/";
    private double result;
    private Map<String, Integer> getComputeOper() {
        HashMap computeOper = new HashMap<String, Integer>();
        computeOper.put("+", PLUS);
        computeOper.put("-", SUB);
        computeOper.put("*", MUL);
        computeOper.put("/", DIV);
        computeOper.put("(", BRACKET);

        return computeOper;
    }


    private boolean isNum(String str) {
        Pattern pattern = Pattern.compile("[0-9]*");
        return pattern.matcher(str).matches();
    }

    private boolean isNumDecimal(String str){
        Pattern pattern = Pattern.compile("[0-9]*\\.[0-9]*");
        return pattern.matcher(str).matches();
    }

    private boolean isNumInt(String str){
        Pattern pattern = Pattern.compile("[0-9]*\\.0");
        return pattern.matcher(str).matches();
    }

    private MathAlgorithm getOperatorInstace(String s) {
        switch (s) {
            case "+":
                return new Add();
            case "-":
                return new Sub();
            case "*":
                return new Mul();
            case "/":
                return new Div();
            default:
                return null;
        }
    }

    private void compute(Stack<Double> arithmeticstack, Stack<String> operatorStack) {
        MathContext con = new MathContext(getOperatorInstace(operatorStack.pop()));
        double num1 = arithmeticstack.pop();
        double num2 = arithmeticstack.pop();
        arithmeticstack.push(con.execute(num2, num1));
    }


    private double handleCal(String mathicFmul) {
        Stack<String> operatorStack = new Stack<>();
        Stack<Double> arithmeticStack = new Stack<>();
        Map<String, Integer> computeOper = getComputeOper();
        StringTokenizer st = new StringTokenizer(mathicFmul, DELIM, true);
        if (mathicFmul.length() < 1) return 0.0;
        String ch;
        while (st.hasMoreTokens()) {
            ch = st.nextToken();
            if (isNum(ch) || isNumDecimal(ch)) {
                arithmeticStack.push(Double.valueOf(ch));
            } else {
                int currentOper = computeOper.get(ch);
                if (currentOper != 0) {
                    while (!operatorStack.empty() && computeOper.get(operatorStack.peek()) >= currentOper) {
                        compute(arithmeticStack, operatorStack);
                    }
                    operatorStack.push(ch);
                }
            }
        }
        while (!operatorStack.empty()) {
            compute(arithmeticStack, operatorStack);
        }
        return arithmeticStack.pop();
    }

    public void setResult(double val) {
        this.result = val;
    }
    public double getResult() {
        return result;
    }

    public String getValueToString() {
        setResult(handleCal(getExpression()));
        clear();
        if (isNumInt(Double.toString(getResult()))) {
            handleDisplayExpression(Integer.toString((int)getResult()));
            return Integer.toString((int)getResult());
        } else {
            handleDisplayExpression(Double.toString(getResult()));
            return Double.toString(getResult());
        }
    }



}
