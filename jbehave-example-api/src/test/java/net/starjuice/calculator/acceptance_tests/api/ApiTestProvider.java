package net.starjuice.calculator.acceptance_tests.api;

import net.starjuice.calculator.acceptance_tests.ImperativeTestProvider;
import net.starjuice.calculator.api.Calculator;
import net.starjuice.calculator.api.ReferenceCalculator;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@TestProvider
public class ApiTestProvider implements ImperativeTestProvider {

    @Autowired
    private Calculator calculator;

    private int actual;

    @Override
    public void make_a_calculator() {
    }

    @Override
    public void make_calculator_add_two_numbers(int a, int b) {
        actual = calculator.add(a, b);
    }

    @Override
    public void check_calculator_answer(int expected) {
        Assert.assertEquals(expected, actual);
    }
}
