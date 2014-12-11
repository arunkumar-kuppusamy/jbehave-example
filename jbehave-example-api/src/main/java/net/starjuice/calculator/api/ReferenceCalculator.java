package net.starjuice.calculator.api;

@DomainComponent
public class ReferenceCalculator implements Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int subtract(int minuend, int subtrahend) {
        return minuend - subtrahend;
    }
}
