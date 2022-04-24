package com.example.dentistclinic.service;

import com.example.dentistclinic.entities.Pacient;

import java.util.List;

public interface IPacientService {

    Pacient save(Pacient pacient);
    List<Pacient> findAll();
    Pacient findById(Long id);
    void deleteById(Long id);
    void update(Pacient pacient);

}
