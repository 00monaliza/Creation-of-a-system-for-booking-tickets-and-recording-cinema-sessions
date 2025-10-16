package com.rizat.cinema.repository;

import com.rizat.cinema.model.Session;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface SessionRepository extends JpaRepository<Session, Long> {
    // Поиск сеансов по фильму и времени
    List<Session> findByFilmIdAndStartTimeAfter(Long filmId, LocalDateTime startTime);
}