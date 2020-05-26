package com.example.nini.budxense.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

///Lombok will create Getters/Setters for all fields behind the scenes.
@Data

@Entity


//Will create my constructor
@NoArgsConstructor
@AllArgsConstructor

@Table(name = "user")
public class User {

    @Id
    private Long id;
    private String name;
    private String email;

    /// One user can access multiple/any category
    @OneToMany
    private Set<Category> category;
}
