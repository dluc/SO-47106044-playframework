package consoleapp;

import com.google.inject.*;
import services.IDependency;

public class Main {

    static Injector injector = Guice.createInjector(Stage.PRODUCTION, new Module());

    public static void main(String[] args) {

        System.out.println("1: " + get());
        System.out.println("2: " + get());
        System.out.println("3: " + get());
        System.out.println("4: " + get());
        System.out.println("5: " + get());
    }

    private static int get() {
        IDependency instance = injector.getInstance(IDependency.class);
        return instance.doSomething();
    }
}
