package com.example.nini.budxense.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor

@Data
@Entity

@Table(name = "category")
public class Category {
    @Id

    private Long id;

    /// Education/Travel/Groceries/Rent
    private String name;

    /// Many categories can be assigned to one user.

    @ManyToOne(cascade = CascadeType.PERSIST)
    private User user;
}
