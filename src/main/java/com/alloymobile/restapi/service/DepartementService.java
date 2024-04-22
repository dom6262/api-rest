package com.alloymobile.restapi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.alloymobile.restapi.persistance.Departement;
import com.alloymobile.restapi.persistance.DepartementRepository;

@Service
public class DepartementService {

    DepartementRepository repository;

    // Dependancy Injection juste apres-->
    public DepartementService(DepartementRepository repository) {
        this.repository = repository;
    }

    public List<Departement> getAll() {
        return this.repository.findAll();

    }

    public Departement getById(Long id) {
        return this.repository.findById(id).get();
    }

    public Departement add(Departement departement) {
        return this.repository.save(departement);

    }

    public Departement update(Long id, Departement departement) {
        Optional<Departement> dept = this.repository.findById(id);
        if (dept.isPresent()) {
            dept.get().setName(departement.getName());
            return this.repository.save(dept.get());
        }
        throw new RuntimeException();

    }

    public void delete(Long id) {
        this.repository.deleteById(id);
    }

}
