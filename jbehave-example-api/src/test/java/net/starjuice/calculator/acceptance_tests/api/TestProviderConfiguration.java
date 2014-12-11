package net.starjuice.calculator.acceptance_tests.api;

import net.starjuice.calculator.acceptance_tests.AcceptanceTestsConfiguration;
import net.starjuice.calculator.api.DomainConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({AcceptanceTestsConfiguration.class, DomainConfiguration.class})
@ComponentScan
public class TestProviderConfiguration {
}
