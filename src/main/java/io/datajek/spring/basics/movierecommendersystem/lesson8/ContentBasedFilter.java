package io.datajek.spring.basics.movierecommendersystem.lesson8;

import org.springframework.stereotype.Component;

@Component
public class ContentBasedFilter implements Filter {

    public ContentBasedFilter() {
        super();
        System.out.println("Constructor of ContentBasedFilter called ...");
    }

    public String[] getRecommendations(String movie) {

        //implement logic of content based filter

        //return movie recommendations
        return new String[]{"Happy Feet", "Ice Age", "Shark Tale"};
    }

}