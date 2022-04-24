package com.example.dentistclinic.service;

import com.example.dentistclinic.dto.AppointmentDTO;

import java.util.List;

public interface IAppointmentService {

    void save(AppointmentDTO appointmentDTO);
    List<AppointmentDTO> findAll();
    AppointmentDTO findById(Long id);
    void deleteById(Long id);
    void update(AppointmentDTO appointmentDTO);
}
