package com.cololux.service.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Data
@Table(name = "riskAssessment")
public class RiskAssessment {
    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    @Column(name = "riskId", length = 32 ,nullable = false)
    private String riskId;

    @Column(name = "name", length = 255,nullable = false)
    private String name;

    @Column(name = "email", length = 30,nullable = false)
    private String email;

    @Column(name = "phone", length = 10,nullable = false)
    private String phone;

    @Column(name = "risk", length = 255,nullable = false)
    private String risk;

    @Column(name = "score",nullable = false)
    private Double score;

    @Column(name = "terms",nullable = false)
    private String terms;
}
