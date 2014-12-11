package net.starjuice.calculator.api;

import net.starjuice.calculator.acceptance_tests.AcceptanceTestsConfiguration;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration(classes = AcceptanceTestsConfiguration.class)
@Component
public @interface DomainComponent {
}
