package com.example.agricorp.gardenManagement.services;


import com.example.agricorp.gardenManagement.models.Garden;
import com.example.agricorp.gardenManagement.repositories.GardenRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GardenService {

    private final GardenRepository gardenRepository;

    public GardenService(GardenRepository gardenRepository) {
        this.gardenRepository = gardenRepository;
    }

    public List<Garden> getAllGardens() {
        return gardenRepository.findAll();
    }
}
