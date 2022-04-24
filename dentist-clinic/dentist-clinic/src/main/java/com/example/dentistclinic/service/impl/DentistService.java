package com.example.dentistclinic.service.impl;

import com.example.dentistclinic.entities.Dentist;
import com.example.dentistclinic.repository.IDentistRepository;
import com.example.dentistclinic.service.IDentistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DentistService implements IDentistService {

    @Autowired
    IDentistRepository dentistRepository;


    //SAVE-----------------------------------------------
    public Dentist save(Dentist dentist) {
        return dentistRepository.save(dentist);
    }

    //FIND ALL-----------------------------------------------
    public List<Dentist> findAll() {
        return dentistRepository.findAll();
    }

    //FIND-----------------------------------------------
    public Dentist findById(Long id) {
        Dentist dentistFound = dentistRepository.findById(id).orElse(null
        );
        return dentistFound;
    }

    //DELETE-----------------------------------------------
    public void deleteById(Long id) {
        dentistRepository.deleteById(id);
    }

    //MODIFY-----------------------------------------------
    public void update(Dentist dentist) {
        dentistRepository.save(dentist); //saveAndFlush?
    }
}
