package net.starjuice.calculator.acceptance_tests.api;

import org.springframework.stereotype.Component;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration(classes = TestProviderConfiguration.class)
@ActiveProfiles("tests")
@DirtiesContext
@Component
public @interface TestProvider {
}