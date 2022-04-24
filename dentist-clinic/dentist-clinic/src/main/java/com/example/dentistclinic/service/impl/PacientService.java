package com.example.dentistclinic.service.impl;

import com.example.dentistclinic.entities.Pacient;
import com.example.dentistclinic.repository.IPacientRepository;
import com.example.dentistclinic.service.IPacientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PacientService implements IPacientService {

    @Autowired
    IPacientRepository pacientRepository;

    //SAVE-----------------------------------------------

    public Pacient save(Pacient pacient) {
        return pacientRepository.save(pacient);
    }

    //FIND ALL-----------------------------------------------

    public List<Pacient> findAll() {
        return null;
    }
    //FIND-----------------------------------------------

    public Pacient findById(Long id) {
        Pacient pacientFound = pacientRepository.findById(id).orElse(null);
        return pacientFound;
    }
    //DELETE-----------------------------------------------

    public void deleteById(Long id) {
        pacientRepository.deleteById(id);
    }
    //MODIFY-----------------------------------------------

    public void update(Pacient pacient) {
        pacientRepository.save(pacient);
    }
}
