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
    private String birthday;
    private String email;
    private String phone;
    private String address;
    private double price;

    public AppointmentDto(String appointmentId, String name,
                          String nickName, String birthday,
                          double price, String email,
                          String phone, String address) {
        super();
        this.appointmentId = appointmentId;
        this.name = name;
        this.nickName = nickName;
        this.email = email;
        this.price = price;
        this.phone = phone;
        this.address = address;
        this.birthday = birthday;
    }
}
