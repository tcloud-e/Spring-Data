package com.example.book_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.book_management.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}
