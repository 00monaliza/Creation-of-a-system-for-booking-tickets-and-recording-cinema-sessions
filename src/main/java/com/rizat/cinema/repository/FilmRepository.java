package com.rizat.cinema.repository;

import com.rizat.cinema.model.Film;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FilmRepository extends JpaRepository<Film, Long> {
    // Дополнительные методы можно добавить позже, например:
    // List<Film> findByGenre(String genre);
}