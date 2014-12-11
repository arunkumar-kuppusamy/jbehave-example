package net.starjuice.calculator.acceptance_tests.stories;

import org.jbehave.core.Embeddable;
import org.jbehave.core.io.UnderscoredCamelCaseResolver;

class StoryPathResolverForClass extends UnderscoredCamelCaseResolver {
    private final Class<? extends Embeddable> embeddableClass;

    public StoryPathResolverForClass(Class<? extends Embeddable> embeddableClass) {
        this.embeddableClass = embeddableClass;
        super.removeFromClassName("Story");
    }

    @Override
    protected String resolveName(Class<? extends Embeddable> ignored) {
        System.err.println("DEBUG: resolving story name with " + embeddableClass.getCanonicalName());
        return super.resolveName(embeddableClass);
    }

    @Override
    protected String resolveDirectory(Class<? extends Embeddable> ignored) {
        System.err.println("DEBUG: resolving story directory with " + embeddableClass.getCanonicalName());
        return super.resolveDirectory(embeddableClass);
    }
}
