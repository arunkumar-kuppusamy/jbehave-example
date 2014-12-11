package net.starjuice.calculator.acceptance_tests;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"net.starjuice.calculator.**.acceptance_tests"})
public class AcceptanceTestsConfiguration {
}
