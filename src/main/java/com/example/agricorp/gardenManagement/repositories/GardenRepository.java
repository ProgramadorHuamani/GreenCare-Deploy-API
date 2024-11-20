package com.example.agricorp.gardenManagement.repositories;


import com.example.agricorp.gardenManagement.models.Garden;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GardenRepository extends JpaRepository<Garden, Long> {
}