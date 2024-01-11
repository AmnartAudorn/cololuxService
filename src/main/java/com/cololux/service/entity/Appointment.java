package com.cololux.service.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import java.util.Date;

@Entity
@Data
@Table(name = "appointment")
public class Appointment {
    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    @Column(name = "appointment_id", length = 32 ,nullable = false)
    private String appointmentId;

    @Column(name = "name", length = 255,nullable = false)
    private String name;

    @Column(name = "nick_name", length = 10 ,nullable = false)
    private String nickName;

    @Column(name = "birthday" ,nullable = false)
    private String birthday;

    @Column(name = "email", length = 30,nullable = false)
    private String email;

    @Column(name = "phone", length = 10,nullable = false)
    private String phone;

    @Column(name = "address", length = 255,nullable = false)
    private String address;

    @Column(name = "price", length = 10,nullable = false)
    private double price;

}
