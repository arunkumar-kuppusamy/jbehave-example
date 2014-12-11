package net.starjuice.calculator.acceptance_tests.stub;

import net.starjuice.calculator.acceptance_tests.ImperativeTestProvider;
import org.springframework.stereotype.Component;

@Component
public class StubTestProvider implements ImperativeTestProvider {
    @Override
    public void make_a_calculator() {
    }

    @Override
    public void make_calculator_add_two_numbers(int a, int b) {
    }

    @Override
    public void check_calculator_answer(int answer) {
    }
}
