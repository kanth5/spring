package io.datajek.spring.basics.movierecommendersystem.lesson14c;

public class ContentBasedFilter implements Filter {

    public String[] getRecommendations(String movie) {

        //implement logic of content based filter

        //return movie recommendations
        return new String[]{"Happy Feet", "Ice Age", "Shark Tale"};
    }

}