package com.example.agricorp.lifecycle.repositories;

import com.example.agricorp.lifecycle.models.Lifecycle;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class LifecycleRepository {

    private final List<Lifecycle> lifecycles = new ArrayList<>();

    // Buscar por ID
    public Optional<Lifecycle> findById(String id) {
        return lifecycles.stream().filter(lifecycle -> lifecycle.getId().equals(id)).findFirst();
    }

    // Guardar un nuevo objeto
    public Lifecycle save(Lifecycle lifecycle) {
        lifecycles.add(lifecycle);
        return lifecycle;
    }

    // Eliminar por ID
    public boolean deleteById(String id) {
        return lifecycles.removeIf(lifecycle -> lifecycle.getId().equals(id));
    }

    // Obtener todos los objetos
    public List<Lifecycle> findAll() {
        return lifecycles;
    }
}
