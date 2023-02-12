package com.example.smarthomestay.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.smarthomestay.models.Bills;

@Repository
public interface BillsRepository extends JpaRepository<Bills, Long>{
    
}
