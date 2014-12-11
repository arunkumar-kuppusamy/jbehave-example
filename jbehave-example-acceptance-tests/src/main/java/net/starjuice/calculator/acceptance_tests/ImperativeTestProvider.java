package net.starjuice.calculator.acceptance_tests;

public interface ImperativeTestProvider {
    void make_a_calculator();

    void make_calculator_add(int a, int b);

    void make_calculator_subtract(int minuend, int subtrahend);

    void check_calculator_answer(int answer);
}
