package com.cololux.service.controller;

import com.cololux.service.dto.AppointmentDto;
import com.cololux.service.entity.Appointment;
import com.cololux.service.entity.Product;
import com.cololux.service.respository.AppointmentRepository;
import com.cololux.service.respository.ProductRepository;
import com.cololux.service.service.AppointmentService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class AppointmentController {
    @Autowired
    private AppointmentService appointmentService;

    @Autowired
    private AppointmentRepository appointmentRepository;

    @GetMapping("/get/appointment")
    public List<Appointment> getAppointments() {
        return appointmentRepository.findAll();
    }
    @PostMapping("/create/appointment")
    public ResponseEntity<AppointmentDto> createAppointment(@RequestBody AppointmentDto appointmentDto) {
        AppointmentDto aDto = appointmentService.saveAppointment(appointmentDto);
        return new ResponseEntity<>(aDto, HttpStatus.OK);
    }
}
