package com.stackroute.config;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.stackroute")
public class AppConfig {

//    @Bean
//    public Movie movie()
//    {
//        return new Movie();
//    }
    /*@Bean("actor1")
    public Actor getActorBean1()
    {
        Actor actor=new Actor("Komal","female",22);
        return actor;
    }

    @Bean("actor2")
    public Actor getActorBean2()
    {
        Actor actor=new Actor("Hima","female",22);
        return actor;
    }

    @Bean("actor3")
    public Actor getActorBean3()
    {
        Actor actor=new Actor("Meghana","female",22);
        return actor;
    }

    @Bean("movie1")
    public Movie getMovieBean1(){
        return new Movie(getActorBean1());
    }

    @Bean("movie2")
    public Movie getMovieBean2(){
        return new Movie(getActorBean2());
    }

    @Bean("movie3")
    public Movie getMovieBean3(){
        return new Movie(getActorBean3());
    }
*/
}
