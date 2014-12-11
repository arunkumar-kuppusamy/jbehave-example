package net.starjuice.calculator.acceptance_tests.stories;

import net.starjuice.calculator.acceptance_tests.AcceptanceTest;
import org.jbehave.core.io.StoryPathResolver;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@AcceptanceTest
public class SubtractionStory extends AbstractSpringJBehaveStory {
    @Override
    StoryPathResolver storyPathResolver() {
        return new StoryPathResolverForClass(SubtractionStory.class);
    }
}
