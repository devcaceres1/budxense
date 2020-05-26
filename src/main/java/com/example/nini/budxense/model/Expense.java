package com.example.nini.budxense.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.time.Instant;

@Data
@Entity

@NoArgsConstructor
@AllArgsConstructor

@Table(name = "expense")
public class Expense {
    @Id
    private Long id;

    /// Used as a time stamp.
    private Instant expenseDate;

    private String description;

    ///Acting like a sql join
    @ManyToOne
    private Category category;

    /// A user can have many expenses
    @ManyToOne
    private User user;
}
