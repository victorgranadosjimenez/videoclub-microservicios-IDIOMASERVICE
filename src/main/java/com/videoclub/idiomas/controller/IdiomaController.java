package com.videoclub.idiomas.controller;

import com.videoclub.idiomas.model.Idioma;
import com.videoclub.idiomas.service.IdiomaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/idiomas")
public class IdiomaController {

    private final IdiomaService service;

    public IdiomaController(IdiomaService service) {
        this.service = service;
    }

    @GetMapping
    public List<Idioma> getAll() {
        return service.all();
    }

    @GetMapping("/{id}")
    public Idioma getOne(@PathVariable Long id) {
        return service.one(id).orElse(null);
    }

    @PostMapping
    public Idioma create(@RequestBody Idioma idioma) {
        return service.save(idioma);
    }

    @PutMapping("/{id}")
    public Idioma update(@PathVariable Long id, @RequestBody Idioma idioma) {
        return service.replace(id, idioma);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
