package com.example.dentistclinic.service;

import com.example.dentistclinic.entities.Dentist;

import java.util.List;

public interface IDentistService {

    Dentist save(Dentist dentist);
    List<Dentist> findAll();
    Dentist findById(Long id);
    void deleteById(Long id);
    void update(Dentist dentist);

}
