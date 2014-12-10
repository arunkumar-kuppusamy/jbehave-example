package net.starjuice.calculator.acceptance_tests;

public interface ImperativeTestProvider {
    void make_a_calculator();

    void make_calculator_add_two_numbers(int a, int b);

    void check_calculator_answer(int answer) throws Throwable;
}
