package net.starjuice.calculator.crazy_api;

public class CrazyCalculator {

    int value;
    String op;

    public CrazyCalculator() {
        op = null;
    }

    public void number(int i) {
        if ("plus".equals(op)) {
            value += i;
            op = null;
        } else if ("minus".equals(op)) {
            value -= i;
            op = null;
        } else {
            value = i;
        }
    }

    public void plus() {
        op = "plus";
    }

    public void minus() {
        op = "minus";
    }

    public int equal() {
        return value;
    }
}
