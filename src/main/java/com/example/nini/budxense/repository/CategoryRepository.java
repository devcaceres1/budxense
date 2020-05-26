package com.example.nini.budxense.repository;

import com.example.nini.budxense.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

/// Using the Long id from Category to map.
// Jpa is converting Java classes to databases and vice versa.

public interface CategoryRepository extends JpaRepository<Category, Long> {

    /// When I search for category in the table, look at name and not id.
    Category findByName(String name);
}
