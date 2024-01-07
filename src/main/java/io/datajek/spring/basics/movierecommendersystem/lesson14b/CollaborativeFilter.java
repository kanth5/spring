package io.datajek.spring.basics.movierecommendersystem.lesson14b;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class CollaborativeFilter implements Filter {

    public String[] getRecommendations(String movie) {
        //logic of content based filter
        return new String[] {"Finding Nemo", "Ice Age", "Toy Story"};
    }
}