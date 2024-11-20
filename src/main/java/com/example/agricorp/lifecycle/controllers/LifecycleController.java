package com.example.agricorp.lifecycle.controllers;

import com.example.agricorp.lifecycle.models.Lifecycle;
import com.example.agricorp.lifecycle.services.LifecycleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/lifecycle")
public class LifecycleController {

    @Autowired
    private LifecycleService lifecycleService;

    @GetMapping
    public List<Lifecycle> getAll() {
        return lifecycleService.getAll();
    }

    @GetMapping("/{lifecycleid}")
    public ResponseEntity<Lifecycle> getById(@PathVariable String id) {
        Optional<Lifecycle> lifecycle = lifecycleService.getById(id);
        return lifecycle.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.status(HttpStatus.NOT_FOUND).build());
    }

    @PostMapping
    public ResponseEntity<Lifecycle> create(@RequestBody Lifecycle lifecycle) {
        Lifecycle createdLifecycle = lifecycleService.create(lifecycle);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdLifecycle);
    }

    @DeleteMapping("/{lifecycleid}")
    public ResponseEntity<Void> delete(@PathVariable String id) {
        boolean deleted = lifecycleService.deleteById(id);
        return deleted ? ResponseEntity.noContent().build() : ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }
}
