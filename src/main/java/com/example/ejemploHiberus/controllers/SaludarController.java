/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.ejemploHiberus.controllers;

import com.example.ejemploHiberus.entities.Persona;
import java.util.List;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.ejemploHiberus.repositories.PersonaRepository;

/**
 *
 * @author Usuario
 */
@RestController
public class SaludarController {

    @Autowired
    private PersonaRepository repo;

    @GetMapping("/saludar")
    public String saludar() {
        return "Hola mundo";
    }

    @GetMapping("/add")
    public List<Persona> add() {
        Persona p = new Persona();
        p.setNombre(UUID.randomUUID().toString());
        repo.save(p);
        return repo.findAll();
    }

}
