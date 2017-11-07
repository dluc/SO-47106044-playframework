package services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import play.Logger;

// This singleton doesn't matter, just showing that the failure isn't cached
@Singleton
public class ExternalDependency implements IExternalDependency {

    private static final Logger.ALogger log = Logger.of(ExternalDependency.class);

    static int calls = 1;

    @Inject
    public ExternalDependency() throws Exception {
        log.info("New instance of " + this.getClass().getName());

        // Fail only the first time
        if (calls++ == 1) {
            throw new Exception("Temporary error, calls = " + calls);
        }
    }

    @Override
    public int doSomething() {
        return 0;
    }
}
