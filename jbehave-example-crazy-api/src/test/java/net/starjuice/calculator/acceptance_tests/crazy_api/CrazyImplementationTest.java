package net.starjuice.calculator.acceptance_tests.crazy_api;

import net.starjuice.calculator.acceptance_tests.ImperativeTestProvider;
import net.starjuice.calculator.crazy_api.CrazyCalculator;
import org.junit.Assert;
import org.springframework.stereotype.Component;

@Component
public class CrazyImplementationTest implements ImperativeTestProvider {
    private CrazyCalculator calculator;

    @Override
    public void make_a_calculator() {
        calculator = new CrazyCalculator();
    }

    @Override
    public void make_calculator_add_two_numbers(int a, int b) {
        calculator.number(a);
        calculator.plus();
        calculator.number(b);
    }

    @Override
    public void check_calculator_answer(int expected) {
        int actual = calculator.equal();
        Assert.assertEquals(expected, actual);
    }
}
