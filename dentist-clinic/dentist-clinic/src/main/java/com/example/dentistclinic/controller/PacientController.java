package com.example.dentistclinic.controller;


import com.example.dentistclinic.entities.Pacient;
import com.example.dentistclinic.service.IPacientService;
import com.example.dentistclinic.service.impl.PacientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/pacients")
public class PacientController {

    @Autowired
    private PacientService pacientService;


    private boolean bodyValidation(Pacient pacient) {
        boolean body;
        if (pacient.getSurname() != null && pacient.getName() != null && pacient.getDni() !=null) {
            body = true;
        } else body = false;
        return body;
    }


    //POST ------------------------------------------------------------------
    @PostMapping
    public ResponseEntity<String> postPacient(@RequestBody Pacient pacient) {
        if (bodyValidation(pacient)) {
            pacientService.save(pacient);
            return ResponseEntity.ok("El paciente se guardo en la base de datos");
        } else return ResponseEntity.badRequest().body("El paciente tiene campos incompletos");
    }

    //GET ALL ------------------------------------------------------------------
    @GetMapping
    public List<Pacient> getAll() {
        return pacientService.findAll();
    }

    //GET BY ID ------------------------------------------------------------------
    @GetMapping(path ="/{id}")
    public ResponseEntity<Pacient> getById (@PathVariable Long id) {
        Pacient pacientResponse = pacientService.findById(id);
        return ResponseEntity.ok(pacientResponse);
    }

    //DELETE BY ID ------------------------------------------------------------------
    @DeleteMapping(path = "/{id}")
    public void deleteById(@PathVariable Long id) {
        pacientService.deleteById(id);
    }

    //PUT ------------------------------------------------------------------
    @PutMapping(path = "/{id}")
    public void putById(@PathVariable Long id, @RequestBody Pacient pacient) {
        pacient.setId(id);
        pacientService.update(pacient);
    }

}
