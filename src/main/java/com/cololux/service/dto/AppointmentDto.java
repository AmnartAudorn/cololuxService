package com.cololux.service.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Column;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;
@Data
@ToString
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class AppointmentDto {
    private String appointmentId;
    private String name;
    private String nickName;
    private String email;
    private String phone;
    private String details;

    public AppointmentDto(String appointmentId, String name,
                          String nickName, String email,
                          String phone, String details) {
        super();
        this.appointmentId = appointmentId;
        this.name = name;
        this.nickName = nickName;
        this.email = email;
        this.phone = phone;
        this.details = details;
    }
}
