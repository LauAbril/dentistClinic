package com.example.dentistclinic.service.impl;

import com.example.dentistclinic.dto.AppointmentDTO;
import com.example.dentistclinic.entities.Appointment;
import com.example.dentistclinic.repository.IAppointmentRepository;
import com.example.dentistclinic.service.IAppointmentService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AppointmentService implements IAppointmentService {
//pq se borra el overide??

    @Autowired
    IAppointmentRepository appointmentRepository;
    @Autowired
    ObjectMapper mapper;

    public void save(AppointmentDTO appointmentDTO) {
        Appointment appointmentToSave = mapper.convertValue(appointmentDTO, Appointment.class);
        appointmentRepository.save(appointmentToSave);
    }


    public List<AppointmentDTO> findAll() {
        List<AppointmentDTO> listAppointmentsDto = new ArrayList<>();
        List<Appointment> listAppointments = appointmentRepository.findAll();
        for (Appointment appointment : listAppointments) {
            listAppointmentsDto.add(mapper.convertValue(appointment, AppointmentDTO.class));
        }
        return listAppointmentsDto;
    }


    public AppointmentDTO findById(Long id) {
        AppointmentDTO appointmentFound = mapper.convertValue(appointmentRepository.findById(id), AppointmentDTO.class);
        return appointmentFound;
    }


    public void deleteById(Long id) {
        appointmentRepository.deleteById(id);
    }


    public void update(AppointmentDTO appointmentDTO) {
        Appointment appointmentToModify = mapper.convertValue(appointmentDTO, Appointment.class);
        appointmentRepository.save(appointmentToModify);
    }
}