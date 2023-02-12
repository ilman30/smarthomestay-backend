package com.example.smarthomestay.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.smarthomestay.models.Users;

@Repository
public interface UserRepository extends JpaRepository<Users, Long> {
    
}
