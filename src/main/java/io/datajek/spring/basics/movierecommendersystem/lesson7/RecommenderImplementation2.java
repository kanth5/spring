package io.datajek.spring.basics.movierecommendersystem.lesson7;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation2 {

    private Filter filter;

    //setter injection

    // Setter injection is more readable as it specifies the name of the dependency as the method name but the number of setter methods increases with
    // each increasing dependency increasing the boilerplate code. Setter injection is used to avoid the BeanCurrentlyInCreationException raised in case
    // of a circular dependency, because unlike constructor injection where dependencies are injected at the time when context is loaded, setter injection
    // injects dependencies when they are needed.

    @Autowired
    @Qualifier("contentBasedFilter")
    public void setFilter(Filter filter) {
        this.filter = filter;
        System.out.println("Setter method invoked..");
    }

    //use a filter to find recommendations
    public String [] recommendMovies (String movie) {

        //print the name of interface implementation being used
        System.out.println("\nName of the filter in use: " + filter + "\n");

        String[] results = filter.getRecommendations("Finding Dory");

        return results;
    }

}