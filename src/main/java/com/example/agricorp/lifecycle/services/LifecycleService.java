package com.example.agricorp.lifecycle.services;

import com.example.agricorp.lifecycle.models.Lifecycle;
import com.example.agricorp.lifecycle.repositories.LifecycleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LifecycleService {

    @Autowired
    private LifecycleRepository lifecycleRepository;

    public List<Lifecycle> getAll() {
        return lifecycleRepository.findAll();
    }

    public Optional<Lifecycle> getById(String id) {
        return lifecycleRepository.findById(id);
    }

    public Lifecycle create(Lifecycle lifecycle) {
        return lifecycleRepository.save(lifecycle);
    }

    public boolean deleteById(String id) {
        return lifecycleRepository.deleteById(id);
    }
}
