package com.example.agricorp.lifecycle.handlers;

import com.example.agricorp.lifecycle.services.LifecycleService;
import com.example.agricorp.lifecycle.models.Lifecycle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LifecycleHandler {

    @Autowired
    private LifecycleService lifecycleService;

    public Lifecycle createLifecycle(Lifecycle lifecycle) {
        return lifecycleService.create(lifecycle);
    }

    public boolean deleteLifecycle(String id) {
        return lifecycleService.deleteById(id);
    }

    public Lifecycle getLifecycleById(String id) {
        return lifecycleService.getById(id).orElse(null);
    }

    public Iterable<Lifecycle> getAllLifecycles() {
        return lifecycleService.getAll();
    }
}