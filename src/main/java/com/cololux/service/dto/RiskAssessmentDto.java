package com.cololux.service.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class RiskAssessmentDto {
    private String riskId;
    private String name;
    private String score;
    private String email;
    private String phone;
    private String risk;
    private String terms;

    public RiskAssessmentDto(String riskId, String name,
                          String score, String email,
                          String phone, String risk,String terms) {
        super();
        this.riskId = riskId;
        this.name = name;
        this.score = score;
        this.email = email;
        this.phone = phone;
        this.risk = risk;
        this.terms = terms;
    }
}
