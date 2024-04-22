package com.alloymobile.restapi.resource;

import org.springframework.web.bind.annotation.RestController;

import com.alloymobile.restapi.service.DepartementService;

import com.alloymobile.restapi.persistance.Departement;
//import com.alloymobile.restapi.persistance.DepartementRepository;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
public class DepartementResource {
    DepartementService service;

    public DepartementResource(DepartementService service) {
        this.service = service;
    }

    @GetMapping(value = "/departements")
    public List<Departement> getAll() {
        return this.service.getAll();

    }

    @GetMapping(value = "/departements/{id}")
    public Departement getById(@PathVariable Long id) {
        return this.service.getById(id);

    }

    @PostMapping(value = "/departements")
    public Departement add(Departement departement) {
        return this.service.add(departement);

    }

    @PutMapping(value = "/departements/{id}", consumes = "application.json")
    public Departement update(@PathVariable Long id, @RequestBody Departement departement) {
        return this.service.update(id, departement);

    }

    @DeleteMapping(value = "/departements/{id}")
    public void delete(@PathVariable Long id) {
        // verifier qu'il y a "return"
        this.service.delete(id);

    }

}
// essai numero 2