package net.starjuice.calculator.acceptance_tests.stories;

import net.starjuice.calculator.acceptance_tests.annotations.AcceptanceTest;
import org.jbehave.core.Embeddable;
import org.jbehave.core.configuration.Configuration;
import org.jbehave.core.io.UnderscoredCamelCaseResolver;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@AcceptanceTest
public class AdditionStory extends AbstractSpringJBehaveStory {

    private class FixedStoryPathResolver extends UnderscoredCamelCaseResolver {
        @Override
        protected String resolveName(Class<? extends Embeddable> embeddableClass) {
            // TODO Can I use an annotation for this instead, so implementors can call their child classes what they like?
            return "addition";
        }
    }

    @Override
    public Configuration configuration() {
        return super.configuration().useStoryPathResolver(new FixedStoryPathResolver());
    }

}