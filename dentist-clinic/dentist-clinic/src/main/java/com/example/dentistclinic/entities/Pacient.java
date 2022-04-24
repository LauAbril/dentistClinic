package com.example.dentistclinic.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;

@Entity
@Table(name="pacients")
public class Pacient {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column
    private String surname;
    @Column
    private String name;
    @Column
    private String dni;
    @Column(name = "date")
    private LocalDate dateOfRegistry;


    @OneToOne(cascade = {CascadeType.REMOVE, CascadeType.REFRESH, CascadeType.PERSIST})
    @JoinColumn(name = "address_id", referencedColumnName = "id")
    private Address address;

    @OneToMany(mappedBy = "pacient")
    @JsonIgnore
    private Set<Appointment> appointments = new HashSet<>();

    //GETTERS ----------------------------------------------------------
    public Long getId() {
        return id;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public Address getAdress() {
        return address;
    }

    public String getDni() {
        return dni;
    }

    public LocalDate getDateOfRegistry() {
        return dateOfRegistry;
    }


    //SETTERS ----------------------------------------------------------
    public void setDateOfRegistry(LocalDate dateOfRegistry) {
        this.dateOfRegistry = dateOfRegistry;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setAppointments(Set<Appointment> appointments) {
        this.appointments = appointments;
    }
}
