package com.example.dentistclinic.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name= "dentists")
public class Dentist {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column
    private Integer registrationNumber;
    @Column
    private String surname;
    @Column
    private String name;

    @OneToMany(mappedBy = "dentist")
    @JsonIgnore
    private Set<Appointment> appointments = new HashSet<>();

    //GETTERS -----------------------------------------
    public Long getId() {
        return id;
    }

    public Integer getRegistrationNumber() {
        return registrationNumber;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

//SETTERS ----------------------------------------

    public void setId(Long id) {
        this.id = id;
    }

    public void setRegistrationNumber(Integer registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAppointments(Set<Appointment> appointments) {
        this.appointments = appointments;
    }
}
