package com.matheusklabunde.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matheusklabunde.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
