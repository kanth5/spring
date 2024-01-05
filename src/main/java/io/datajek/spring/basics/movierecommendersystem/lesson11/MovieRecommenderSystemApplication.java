package io.datajek.spring.basics.movierecommendersystem.lesson11;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MovieRecommenderSystemApplication {

    public static void main(String[] args) {

        //ApplicationContext manages the beans and dependencies
        ApplicationContext appContext = SpringApplication.run(MovieRecommenderSystemApplication.class, args);

        //use ApplicationContext to get recommender object
        // Observe the sequence of events with constructor, @PostConstruct and @PreDestroy for RecommenderImplementation & its dependency ContentBasedFilter
        RecommenderImplementation recommender = appContext.getBean(RecommenderImplementation.class);

        System.out.println();
        System.out.println();
        System.out.println(recommender);

        //call method to get recommendations
        String[] result = recommender.recommendMovies("Finding Dory");

        //display results
        System.out.println();
        System.out.println();
        System.out.println(Arrays.toString(result));

        //Retrieving prototype bean from application context twice to show that @PreDestroy is not called by Spring and is the responsibility of the application
        // to do the cleanup of the Prototype beans
        System.out.println();
        Movie m1 = appContext.getBean(Movie.class);
        System.out.println(m1);

        System.out.println();
        Movie m2 = appContext.getBean(Movie.class);
        System.out.println(m2);
    }
}