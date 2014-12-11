package net.starjuice.calculator.acceptance_tests.steps;

import net.starjuice.calculator.acceptance_tests.ImperativeTestProvider;
import org.jbehave.core.annotations.When;
import org.springframework.beans.factory.annotation.Autowired;

@Steps
public class SubtractionSteps {

    @Autowired
    private ImperativeTestProvider testProvider;

    @When("I make the calculator add subtract $b from $a")
    public void when_i_make_the_calculator_subtract(int subtrahend, int minuend) {
        testProvider.make_calculator_subtract(minuend, subtrahend);
    }
}
