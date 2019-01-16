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

//        Movie movie=(Movie) context.getBean("movie");
//        System.out.println(movie.getActor());

        Movie movie = (Movie) context.getBean("movie1");
        System.out.println((movie.getActor()));


        movie = (Movie) context.getBean("movie2");
        System.out.println((movie.getActor()));

        movie = (Movie) context.getBean("movie3");
        System.out.println((movie.getActor()));


        Movie movie1 = (Movie) context.getBean("movie1");
        System.out.println((movie1.getActor()));

        Movie movie2 = (Movie) context.getBean("movie1");
        System.out.println((movie2.getActor()));

        System.out.println("Equality Check for objects "+(movie1 == movie2));


        movie1 = (Movie) context.getBean("movie2");
        System.out.println((movie1.getActor()));

        movie2 = (Movie) context.getBean("movie2");
        System.out.println((movie2.getActor()));

        System.out.println("Equality Check for objects after scope "+(movie1 == movie2));

        System.out.println("Using Name Attribute");
        movie1 = (Movie) context.getBean("movie4");
        System.out.println((movie1.getActor()));

        movie2 = (Movie) context.getBean("movie5");
        System.out.println((movie2.getActor()));



    }
}
