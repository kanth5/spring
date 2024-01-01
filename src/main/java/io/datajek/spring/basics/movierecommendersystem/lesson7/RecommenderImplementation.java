package io.datajek.spring.basics.movierecommendersystem.lesson7;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation {

    private Filter filter;

    //constructor injection

    // Constructor injection ensures that all dependencies are injected because an object cannot be constructed until all its dependencies are available.
    // It also ensures immutability as the state of the bean cannot be modified after creation.

    // Using field injection keeps the code simple and readable, but it is unsafe because Spring can set private fields of the objects. Testing also becomes
    // inconvenient because we need a way to perform dependency injection for testing. Yet another disadvantage is that a developer may add a lot of optional
    // dependencies which can make the application complex. If there was a constructor, then each additional dependency would result in increasing the number
    // of arguments of the constructor.

    @Autowired
    public RecommenderImplementation(@Qualifier("collaborativeFilter") Filter filter) {
        super();
        this.filter = filter;
        System.out.println("Constructor invoked...");
    }


    //use the injected filter to find recommendations
    public String [] recommendMovies (String movie) {

        //print the name of interface implementation being used
        System.out.println("\nName of the filter in use: " + filter + "\n");

        String[] results = filter.getRecommendations("Finding Dory");

        return results;
    }

}