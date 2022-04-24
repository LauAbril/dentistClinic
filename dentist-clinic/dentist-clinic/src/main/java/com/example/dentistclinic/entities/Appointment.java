package com.example.dentistclinic.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name= "appointments")
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column(name ="date&time")
    private LocalDateTime dateTime;

    @ManyToOne
    @JoinColumn(name = "pacient_id", nullable = false, referencedColumnName = "id")
    private Pacient pacient;

    @ManyToOne
    @JoinColumn(name = "dentist_id", nullable = false, referencedColumnName = "id")
    private Dentist dentist;


//GETTERS -------------------------------------------

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

    //SETTERS -------------------------------------------


    public void setId(Long id) {
        this.id = id;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public void setPacient(Pacient pacient) {
        this.pacient = pacient;
    }

    public void setDentist(Dentist dentist) {
        this.dentist = dentist;
    }
}
