package com.example.agricorp.gardenManagement.controllers;


import com.example.agricorp.gardenManagement.models.Garden;
import com.example.agricorp.gardenManagement.services.GardenService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/garden")
public class GardenController {

    private final GardenService gardenService;

    public GardenController(GardenService gardenService) {
        this.gardenService = gardenService;
    }
    @GetMapping
    public ResponseEntity<List<Garden>> getAllGardens() {
        List<Garden> gardens = gardenService.getAllGardens();
        return ResponseEntity.ok(gardens);
    }
}
