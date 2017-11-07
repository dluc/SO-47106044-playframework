package services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import play.Logger;

// This singleton doesn't matter, just showing that the failure isn't cached
@Singleton
public class SomeDependency implements IDependency {

    private static final Logger.ALogger log = Logger.of(SomeDependency.class);

    private IExternalDependency counter;

    @Inject
    public SomeDependency(IExternalDependency counter) {
        log.info("New instance of " + this.getClass().getName());
        this.counter = counter;
    }

    @Override
    public int doSomething() {
        return this.counter.doSomething();
    }
}
