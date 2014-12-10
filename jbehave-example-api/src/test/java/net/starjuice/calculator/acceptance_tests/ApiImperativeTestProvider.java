package net.starjuice.calculator.acceptance_tests;

import net.starjuice.calculator.api.Calculator;
import net.starjuice.calculator.api.ReferenceCalculator;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ApiImperativeTestProvider implements ImperativeTestProvider {

/*
    // Trying this gave: org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'apiImperativeTestProvider': Injection of autowired dependencies failed; nested exception is org.springframework.beans.factory.BeanCreationException: Could not autowire field: private net.starjuice.calculator.api.Calculator net.starjuice.calculator.acceptance_tests.ApiImperativeTestProvider.calculator; nested exception is org.springframework.beans.factory.NoSuchBeanDefinitionException: No qualifying bean of type [net.starjuice.calculator.api.Calculator] found for dependency: expected at least 1 bean which qualifies as autowire candidate for this dependency. Dependency annotations: {@org.springframework.beans.factory.annotation.Autowired(required=true)}
    @Autowired
*/
    private Calculator calculator;
    int actual;

    @Override
    public void make_a_calculator() {
        calculator = new ReferenceCalculator();
    }

    @Override
    public void make_calculator_add_two_numbers(int a, int b) {
        actual = calculator.add(a, b);
    }

    @Override
    public void check_calculator_answer(int expected) throws Throwable {
        Assert.assertEquals(expected, actual);
    }
}
