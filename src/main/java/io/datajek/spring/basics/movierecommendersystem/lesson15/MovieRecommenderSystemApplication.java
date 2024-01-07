package io.datajek.spring.basics.movierecommendersystem.lesson15;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.PropertySource;

import java.util.Arrays;

@SpringBootApplication
@PropertySource("classpath:app1.properties")
public class MovieRecommenderSystemApplication {

    public static void main(String[] args) {

        //ApplicationContext manages the beans and dependencies
        ApplicationContext appContext = SpringApplication.run(
                MovieRecommenderSystemApplication.class, args);

        //use ApplicationContext to find which filter is being used
        RecommenderImplementation recommender = appContext.getBean(
                RecommenderImplementation.class);

        //display value read from external property file
        String favoriteMovie = recommender.returnFavoriteMovie();
        System.out.println(favoriteMovie);

        //call method to get recommendations
        String[] result = recommender.recommendMovies(favoriteMovie);

        //display results
        System.out.println(Arrays.toString(result));

    }

}