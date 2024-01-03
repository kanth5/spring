package io.datajek.spring.basics.movierecommendersystem.lesson10a;

import io.datajek.spring.basics.movierecommendersystem.lesson10c.Filter;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class CollaborativeFilter implements Filter {

    public CollaborativeFilter() {
        super();
        System.out.println("Constructor of CollaborativeFilter called ...");
    }

    public String[] getRecommendations(String movie) {
        //logic of content based filter
        return new String[] {"Finding Nemo", "Ice Age", "Toy Story"};
    }
}