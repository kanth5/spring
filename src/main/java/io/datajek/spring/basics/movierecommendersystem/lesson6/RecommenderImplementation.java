package io.datajek.spring.basics.movierecommendersystem.lesson6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation {

    @Autowired
    @Qualifier("CF")
    //use filter interface to select filter. The @Qualifier annotation takes precedence over the @Primary annotation.

    // @Primary is the default setting, while @Qualifier is specific. @Primary defines the default selection when no other information is available.
    // It tells Spring to use the bean marked as primary as its first choice if it encounters more than one bean of the same type. On the other hand,
    // @Qualifier tells Spring to use a specific bean if it finds multiple beans of matching type.

    // @Primary annotation should be used if there is one clear favorite to be used in a majority of situations. In some cases, one algorithm might be more
    // efficient or more important than the rest and is declared as the primary choice. The bean with @Primary gets chosen unless another bean is required,
    // which can be specified with @Qualifier. The bean with @Qualifier is only used to request an “alternate” bean in case the primary choice is not required.

    private Filter filter;

    //use a filter to find recommendations
    public String [] recommendMovies (String movie) {

        //print the name of interface implementation being used
        System.out.println("Name of the filter in use: " + filter + "\n");

        String[] results = filter.getRecommendations("Finding Dory");

        return results;
    }

}