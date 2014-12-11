package net.starjuice.calculator.acceptance_tests.steps;

import net.starjuice.calculator.acceptance_tests.ImperativeTestProvider;
import org.jbehave.core.annotations.When;
import org.springframework.beans.factory.annotation.Autowired;

@Steps
public class AdditionSteps {

    @Autowired
    private ImperativeTestProvider testProvider;

    @When("I make the calculator add two numbers $a and $b")
    public void i_make_the_calculator_add_two_numbers(int a, int b) {
        testProvider.make_calculator_add_two_numbers(a, b);
    }

}
