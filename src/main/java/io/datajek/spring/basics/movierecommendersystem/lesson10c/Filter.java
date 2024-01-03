package io.datajek.spring.basics.movierecommendersystem.lesson10c;

public interface Filter {
    public String[] getRecommendations(String movie);
}
