package com.stackroute;

import com.stackroute.config.AppConfig;
import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();
//        Actor actor = (Actor) context.getBean("actor");
//        System.out.println((actor));

        Movie movie=(Movie) context.getBean("movie");
        System.out.println(movie.getActor());

  /*      Movie movie = (Movie) context.getBean("movie1");
        System.out.println((movie.getActor()));


        movie = (Movie) context.getBean("movie2");
        System.out.println((movie.getActor()));


       movie = (Movie) context.getBean("movie3");
       System.out.println((movie.getActor()));
*/

    }
}
