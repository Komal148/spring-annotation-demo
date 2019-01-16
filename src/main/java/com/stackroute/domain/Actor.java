package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:application.properties")
public class Actor {

    @Autowired
    @Value("${actor.name}")
    private String name;

    @Value("${actor.gender}")
    private String gender;

    @Value("${actor.age}")
    private int age;

    public Actor(){

    }
/*
    public Actor(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }*/
    //    @Autowired
//    public Actor(  @Value("${actor.name}")String name, @Value("${actor.gender}")String gender,@Value("${actor.age}")int age){
//        this.name=name;
//        this.age=age;
//        this.gender=gender;
//
//    }

    @Override
    public String toString() {
        return "Actor{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
