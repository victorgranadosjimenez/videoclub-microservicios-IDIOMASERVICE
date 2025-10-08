package com.videoclub.idiomas.service;

import com.videoclub.idiomas.model.Idioma;
import com.videoclub.idiomas.repository.IdiomaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class IdiomaService {

    private final IdiomaRepository repo;

    public IdiomaService(IdiomaRepository repo) {
        this.repo = repo;
    }

    public List<Idioma> all() {
        return repo.findAll();
    }

    public Optional<Idioma> one(Long id) {
        return repo.findById(id);
    }

    public Idioma save(Idioma idioma) {
        return repo.save(idioma);
    }

    public Idioma replace(Long id, Idioma nuevoIdioma) {
        return repo.findById(id)
                .map(i -> {
                    i.setNombre(nuevoIdioma.getNombre());
                    return repo.save(i);
                })
                .orElseGet(() -> {
                    nuevoIdioma.setId(id);
                    return repo.save(nuevoIdioma);
                });
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}
