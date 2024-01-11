package com.cololux.service.service;

import com.cololux.service.dto.AppointmentDto;
import com.cololux.service.entity.Appointment;
import com.cololux.service.respository.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
public class AppointmentService {

    @Autowired
    AppointmentRepository appointmentRepository;
    public AppointmentDto saveAppointment(AppointmentDto appointmentDto) {
        Appointment appointment = new Appointment();
        if(StringUtils.hasText(appointmentDto.getAppointmentId())){
            appointment = appointmentRepository.findById(appointmentDto.getAppointmentId()).orElse(appointment);
        }
        appointment.setName(appointmentDto.getName());
        appointment.setNickName(appointmentDto.getNickName());
        appointment.setPrice(appointmentDto.getPrice());
        appointment.setEmail(appointmentDto.getEmail());
        appointment.setAddress(appointmentDto.getAddress());
        appointment.setBirthday(appointmentDto.getBirthday());
        appointment.setPhone(appointmentDto.getPhone());
        appointment = appointmentRepository.save(appointment);
        appointmentDto.setAppointmentId(appointment.getAppointmentId());
        return appointmentDto;
    }
}
