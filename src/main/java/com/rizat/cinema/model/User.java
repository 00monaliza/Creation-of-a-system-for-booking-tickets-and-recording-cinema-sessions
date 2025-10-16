package com.rizat.cinema.repository;

import com.rizat.cinema.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // Поиск пользователя по имени
    Optional<User> findByUsername(String username);
}