package com.rizat.cinema.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name = "sessions")
@Data
public class Session {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "film_id", nullable = false)
    private Film film;

    @Column(nullable = false)
    private LocalDateTime startTime;

    @Column(nullable = false)
    private String hall; // Название зала, например, "Hall 1"

    @Column(nullable = false)
    private int totalSeats; // Общее количество мест

    @Column(nullable = false)
    private int availableSeats; // Доступные места
}