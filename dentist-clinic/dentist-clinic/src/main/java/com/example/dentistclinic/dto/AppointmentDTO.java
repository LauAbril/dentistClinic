package com.example.dentistclinic.dto;

import com.example.dentistclinic.entities.Dentist;
import com.example.dentistclinic.entities.Pacient;

import java.time.LocalDateTime;

public class AppointmentDTO {

    private Long id;
    private LocalDateTime dateTime;
    private Pacient pacient;
    private Dentist dentist;

//GETTERS ---------------------------------------------


    public Long getId() {
        return id;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public Pacient getPacient() {
        return pacient;
    }

    public Dentist getDentist() {
        return dentist;
    }

    //SETTERS ---------------------------------------------


    public void setId(Long id) {
        this.id = id;
    }
}



