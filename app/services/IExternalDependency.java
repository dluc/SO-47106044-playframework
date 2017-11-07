package services;

import com.google.inject.ImplementedBy;

@ImplementedBy(ExternalDependency.class)
public interface IExternalDependency {

    int doSomething();
}
