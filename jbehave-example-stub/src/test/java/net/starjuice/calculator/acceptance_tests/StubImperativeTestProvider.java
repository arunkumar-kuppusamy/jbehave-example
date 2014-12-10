package net.starjuice.calculator.acceptance_tests;

import org.springframework.stereotype.Component;

@Component
public class StubImperativeTestProvider implements ImperativeTestProvider {
    @Override
    public void make_a_calculator() {
    }

    @Override
    public void make_calculator_add_two_numbers(int a, int b) {
    }

    @Override
    public void check_calculator_answer(int answer) throws Throwable {
    }
}
