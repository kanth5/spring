package io.datajek.spring.basics.movierecommendersystem.lesson14b;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class MovieRecommenderSystemApplication {

    public static void main(String[] args) {

        //load the configuration file
        ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("appContext2.xml");

        //check the beans which have been loaded
        System.out.println("\nBeans loaded:");
        System.out.println(Arrays.toString(appContext.getBeanDefinitionNames()));

        //retrieve bean from the application context
        RecommenderImplementation recommender = appContext.getBean("recommenderImpl", RecommenderImplementation.class);

        //call method to get recommendations
        String[] result = recommender.recommendMovies("Finding Dory");

        //display results
        System.out.println(Arrays.toString(result));

        appContext.close();

    }

}