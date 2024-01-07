package io.datajek.spring.basics.movierecommendersystem.lesson16;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

@Repository
public class Movie {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    private int id;
    private String name;
    private String genre;
    private String producer;

    public Movie() {
        super();
        logger.info("In Movie constructor method");
    }

    public double movieSimilarity(int movie1, int movie2) {

        double similarity = 0.0;

        //if genres are same add 0.3 to similarity
        //if producers are same add 0.5 to similarity

        return similarity;
    }
}