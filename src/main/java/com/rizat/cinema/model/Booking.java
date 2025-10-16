package com.rizat.cinema.repository;

import com.rizat.cinema.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Long> {
    // Поиск бронирований по сеансу
    List<Booking> findBySessionId(Long sessionId);

    // Поиск бронирований по пользователю
    List<Booking> findByUserId(Long userId);
}