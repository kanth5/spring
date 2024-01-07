package io.datajek.spring.basics.movierecommendersystem.lesson14c;

import org.springframework.beans.factory.annotation.Autowired;

public class RecommenderImplementation {

    @Autowired
    //use filter interface to select filter. Autowiring happening by name here since 'filter' is present in the appContext3.xml file
    private Filter filter;

    public void setFilter(Filter filter) {
        this.filter = filter;
    }

    public Filter getFilter() {
        return filter;
    }

    public RecommenderImplementation() {
    }

    public RecommenderImplementation(Filter filter) {
        this.filter = filter;
    }

    //use a filter to find recommendations
    public String [] recommendMovies (String movie) {

        //print the name of interface implementation being used
        System.out.println("Name of the filter in use: " + filter + "\n");

        String[] results = filter.getRecommendations("Finding Dory");

        return results;
    }

}