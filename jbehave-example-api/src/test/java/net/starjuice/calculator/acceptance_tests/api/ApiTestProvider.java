package net.starjuice.calculator.acceptance_tests.api;

import net.starjuice.calculator.acceptance_tests.ImperativeTestProvider;
import net.starjuice.calculator.api.Calculator;
import net.starjuice.calculator.api.ReferenceCalculator;
import org.junit.Assert;
import org.springframework.stereotype.Component;

@Component
public class ApiTestProvider implements ImperativeTestProvider {

    // TODO ApiTestProvider needs a @Configuration that sets @ComponentScan basePackages for @Autowired to work
    //@Autowired
    private Calculator calculator;

    private int actual;

    @Override
    public void make_a_calculator() {
        calculator = new ReferenceCalculator();
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
