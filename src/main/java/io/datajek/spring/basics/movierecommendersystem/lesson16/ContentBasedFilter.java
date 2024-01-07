package io.datajek.spring.basics.movierecommendersystem.lesson16;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContentBasedFilter implements Filter {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private Movie movie;

    public ContentBasedFilter() {
        super();
        logger.info("In ContentBasedFilter constructor method");
    }

    //getRecommendations takes a movie as input and returns a list of similar movies
    public String[] getRecommendations(String movie) {

        //calculate similarity between movies

        //return movie recommendations
        return new String[]{"Happy Feet", "Ice Age", "Shark Tale"};
    }
}