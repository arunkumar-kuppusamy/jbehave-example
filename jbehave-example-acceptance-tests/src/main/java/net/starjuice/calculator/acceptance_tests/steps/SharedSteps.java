package net.starjuice.calculator.acceptance_tests.steps;

import net.starjuice.calculator.acceptance_tests.ImperativeTestProvider;
import net.starjuice.calculator.acceptance_tests.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.springframework.beans.factory.annotation.Autowired;

@Steps
public class SharedSteps {

    @Autowired
    private ImperativeTestProvider testProvider; // TODO Might run into a problem where the testProvider in AdditionSteps is not the same instance as this one.

    @Given("I have a calculator")
    public void i_have_a_calculator() {
        testProvider.make_a_calculator();
    }

    @Then("the calculator gives me the answer $answer")
    public void the_calculator_gives_me_the_answer(int answer) throws Throwable {
        testProvider.check_calculator_answer(answer);
    }
}
