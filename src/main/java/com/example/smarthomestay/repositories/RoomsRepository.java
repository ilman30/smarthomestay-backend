package com.example.smarthomestay.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.smarthomestay.models.Rooms;

@Repository
public interface RoomsRepository extends JpaRepository<Rooms, Long> {
    
}
