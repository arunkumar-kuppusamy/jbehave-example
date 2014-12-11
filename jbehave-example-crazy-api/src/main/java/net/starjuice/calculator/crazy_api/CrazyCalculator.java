package net.starjuice.calculator.crazy_api;

public class CrazyCalculator {

    int value;
    String op;

    public CrazyCalculator() {
        op = null;
    }

    public void number(int a) {
        if ("plus".equals(op)) {
            value += a;
            op = null;
        } else {
            value = a;
        }
    }

    public void plus() {
        op = "plus";
    }

    public int equal() {
        return value;
    }
}
