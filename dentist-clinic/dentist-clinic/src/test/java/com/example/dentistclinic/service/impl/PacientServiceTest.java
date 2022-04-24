package com.example.dentistclinic.service.impl;

import com.example.dentistclinic.entities.Pacient;
import com.example.dentistclinic.service.IPacientService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PacientServiceTest {

    @Autowired
    private IPacientService pacientService;

    @Test
    public void testCreatePacient() {

        Pacient pacient = new Pacient();
        pacient.setName("Pedro");
        pacient.setSurname("Gonzalez");
        pacientService.save(pacient);

        Pacient pacient1 = pacientService.findById(1L);

        assertTrue(pacient1 != null);
    }
    //FALTAN + TESTS
}