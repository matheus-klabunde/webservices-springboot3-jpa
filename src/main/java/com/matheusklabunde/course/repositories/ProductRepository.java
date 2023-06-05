package com.matheusklabunde.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matheusklabunde.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
