package ru.digitalleague.calculator;

import java.util.ArrayList;
import java.util.List;

public class Calculator {

    private final List<String> history;

    public Calculator() {
        this.history = new ArrayList<>();
    }

    private static <T extends Number> String createHistory(T first, T second, T result, Operator operator) {
        return "[TYPE: " + first.getClass().getTypeName() + " ] " +
                first + " " + operator.toString() + " " + second + " = " + result;
    }

    public String getHistoryForPrint() {
        return String.join("\n", history);
    }

    /**
     * Int
     */
    public int calc(int first, int second, Operator operator) {
        int result;
        switch (operator) {
            case PLUS:
                result = first + second;
                break;
            case MINUS:
                result = first - second;
                break;
            case MULTIPLY:
                result = first * second;
                break;
            case DIVIDE:
                result = first / second;
                break;
            default:
                return 0;
        }
        history.add(createHistory(first, second, result, operator));
        return result;
    }

    public int calc(Operator operator, int first, int second) {
        return calc(first, second, operator);
    }

    public int calc(int first, Operator operator, int second) {
        return calc(first, second, operator);
    }

    public Integer calc(Integer first, Operator operator, Integer second) {
        return calc(first, second, operator);
    }

//    public int calc(int second, Operator operator, int first) {
//        return calc(first, second, operator);
//    }
//
//    public long calc(int second, Operator operator, int first) {
//        return (long)calc(first, second, operator);
//    }

    public int calc(int value, Operator operator) {
        return calc(value, 100, operator);
    }

    /**
     * Long
     */
    public long calc(long first, long second, Operator operator) {
        long result;
        switch (operator) {
            case PLUS:
                result = first + second;
                break;
            case MINUS:
                result = first - second;
                break;
            case MULTIPLY:
                result = first * second;
                break;
            case DIVIDE:
                result = first / second;
                break;
            default:
                return 0;
        }
        history.add(createHistory(first, second, result, operator));
        return result;
    }

    public long calc(Operator operator, long first, long second) {
        return calc(first, second, operator);
    }

    public long calc(long first, Operator operator, long second) {
        return calc(first, second, operator);
    }

    /**
     * Float
     */
    public float calc(float first, float second, Operator operator) {
        float result;
        switch (operator) {
            case PLUS:
                result = first + second;
                break;
            case MINUS:
                result = first - second;
                break;
            case MULTIPLY:
                result = first * second;
                break;
            case DIVIDE:
                result = first / second;
                break;
            default:
                return 0;
        }
        history.add(createHistory(first, second, result, operator));
        return result;
    }

    public float calc(Operator operator, float first, float second) {
        return calc(first, second, operator);
    }

    public float calc(float first, Operator operator, float second) {
        return calc(first, second, operator);
    }

    /**
     * Double
     */
    public double calc(double first, double second, Operator operator) {
        double result;
        switch (operator) {
            case PLUS:
                result = first + second;
                break;
            case MINUS:
                result = first - second;
                break;
            case MULTIPLY:
                result = first * second;
                break;
            case DIVIDE:
                result = first / second;
                break;
            default:
                return 0;
        }
        history.add(createHistory(first, second, result, operator));
        return result;
    }

    public double calc(Operator operator, double first, double second) {
        return calc(first, second, operator);
    }

    public double calc(double first, Operator operator, double second) {
        return calc(first, second, operator);
    }
}
