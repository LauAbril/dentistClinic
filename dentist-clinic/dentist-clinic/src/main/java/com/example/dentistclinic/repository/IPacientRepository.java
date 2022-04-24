package com.example.dentistclinic.repository;

import com.example.dentistclinic.entities.Pacient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPacientRepository extends JpaRepository<Pacient, Long> {


}