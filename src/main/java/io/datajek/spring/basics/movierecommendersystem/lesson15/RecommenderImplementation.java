package io.datajek.spring.basics.movierecommendersystem.lesson15;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation {

    @Autowired
    //use filter interface to select filter. Autowiring by Type is the default if no information is available.
    private Filter filter;

    @Value("${recommender.implementation.favoriteMovie: hello}")
    private String favoriteMovie;

    //use a filter to find recommendations
    public String [] recommendMovies (String movie) {

        //print the name of interface implementation being used
        System.out.println("Name of the filter in use: " + filter + "\n");

        String[] results = filter.getRecommendations("Finding Dory");

        return results;
    }

    public String returnFavoriteMovie() {
        return favoriteMovie;
    }
}