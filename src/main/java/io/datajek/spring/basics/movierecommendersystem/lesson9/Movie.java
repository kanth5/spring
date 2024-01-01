package io.datajek.spring.basics.movierecommendersystem.lesson9;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component

// When a prototype bean is injected into a singleton bean, it loses its prototype behavior and acts as a singleton.

//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)

// The prototype bean doesn’t get autowired into the singleton bean at the time of its creation. Instead, a proxy or placeholder object is autowired.
// The proxy adds a level of indirection. When the developer requests the prototype bean from Spring, a proxy is created and is returned by the application
// context. The proxy mode allows Spring container to inject a new object into the singleton bean when a method on the proxy object is called.

// After making this change in the code, a proxy Movie object is created, and we get a new Movie bean when the ContentBasedFilter bean calls the getMovie()
// method on the proxy object. The proxy resolves the Movie instance and calls getMovie() on the resolved instance.

@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class Movie {
    private static int instances = 0;

    private int id;
    private String name;
    private String genre;
    private String producer;

    public Movie() {
        super();
        instances++;
        System.out.println("Movie constructor called");
    }

    public static int getInstances(){
        return Movie.instances;
    }

    public double movieSimilarity(int movie1, int movie2) {

        double similarity = 0.0;

        //if genres are same add 0.3 to similarity
        //if producers are same add 0.5 to similarity

        return similarity;
    }
}