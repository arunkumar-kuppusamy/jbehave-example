package net.starjuice.calculator.api;

import org.springframework.stereotype.Component;

@Component
public class ReferenceCalculator implements Calculator {

    public int add(int a, int b) {
        return a + b + 1;
    }
}
