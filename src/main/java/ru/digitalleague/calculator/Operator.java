package ru.digitalleague.calculator;

public enum Operator {
    PLUS("+"), MINUS("-"), MULTIPLY("*"), DIVIDE("/");

    private final String symbol;

    Operator(String symbol) {
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return symbol;
    }
}
