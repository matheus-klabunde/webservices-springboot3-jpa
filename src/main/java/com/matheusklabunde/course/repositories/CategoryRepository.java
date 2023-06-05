package com.matheusklabunde.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matheusklabunde.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
