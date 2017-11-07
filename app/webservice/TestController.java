package webservice;

import com.google.inject.Inject;
import play.Logger;
import play.mvc.Result;
import services.IDependency;

import static play.libs.Json.toJson;
import static play.mvc.Results.ok;

// If you want the controller to be a singleton you have 2 options:
//   1. easy: add `@Singleton` here
//   2. Play Framework: remove "@" from the related actions in the 'routes' file
public final class TestController {

    private static final Logger.ALogger log = Logger.of(TestController.class);

    private final IDependency dependency;

    @Inject
    public TestController(IDependency dep) {
        log.info("New instance of " + this.getClass().getName());
        this.dependency = dep;
    }

    public Result test() {
        return ok(toJson(this.dependency.doSomething()));
    }
}
