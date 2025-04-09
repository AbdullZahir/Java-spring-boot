package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity //mapper modellen til database tabell
public class User {
    @Id // primær nøkkel

    //auto inkremetn av iid
    @GeneratedValue(strategy = GenerationType.IDENTITY) // https://stackoverflow.com/questions/20603638/what-is-the-use-of-annotations-id-and-generatedvaluestrategy-generationtype

    private long id;
    private String email;
    private UserType type; 

    //getters
    public Long getId(){
        return id;
    }

    public String getEmail(){
        return email;
    }

    public UserType getType(){
        return type;
    }

    //setters
    public void setId(Long id){
        this.id = id;
    }

    public void setMail(String email){
        this.email = email;

    }

    public void setType(UserType type){
        this.type = type;
    }
    
}
