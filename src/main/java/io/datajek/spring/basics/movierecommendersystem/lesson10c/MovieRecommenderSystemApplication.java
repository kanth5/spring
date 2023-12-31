package io.datajek.spring.basics.movierecommendersystem.lesson10c;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

@SpringBootApplication
//@ComponentScan(basePackages = "io.datajek.spring.basics.movierecommendersystem.lesson10a")

@ComponentScan(basePackages = {"io.datajek.spring.basics.movierecommendersystem.lesson10a",
        "io.datajek.spring.basics.movierecommendersystem.lesson10b"})

// Not working ... Find out why !!!

//@ComponentScan(includeFilters = @ComponentScan.Filter (
//        type= FilterType.REGEX,
//        pattern="io.datajek.spring.basics.movierecommendersystem.lesson10b.*"))

public class MovieRecommenderSystemApplication {

    public static void main(String[] args) {

        //ApplicationContext manages the beans and dependencies
        ApplicationContext appContext = SpringApplication.run(MovieRecommenderSystemApplication.class, args);

        System.out.println("ContentBasedFilter bean found = " +
                appContext.containsBean("contentBasedFilter"));
        System.out.println("CollaborativeFilter bean found = " +
                appContext.containsBean("collaborativeFilter"));
    }
}