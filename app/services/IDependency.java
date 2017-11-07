package services;

import com.google.inject.ImplementedBy;

@ImplementedBy(SomeDependency.class)
public interface IDependency {

    int doSomething();
}
