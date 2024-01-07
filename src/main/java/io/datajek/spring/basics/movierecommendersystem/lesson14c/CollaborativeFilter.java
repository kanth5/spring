package io.datajek.spring.basics.movierecommendersystem.lesson14c;

public class CollaborativeFilter implements Filter {

    public String[] getRecommendations(String movie) {
        //logic of content based filter
        return new String[] {"Finding Nemo", "Ice Age", "Toy Story"};
    }
}