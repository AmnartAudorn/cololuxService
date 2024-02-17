package com.cololux.service.service;

import com.cololux.service.dto.RiskAssessmentDto;
import com.cololux.service.entity.RiskAssessment;
import com.cololux.service.respository.RiskAssessmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
public class RiskAssessmentService {
    @Autowired
    RiskAssessmentRepository riskAssessmentRepository;

    public RiskAssessmentDto saveRiskAssessment(RiskAssessmentDto riskAssessmentDto) {
        RiskAssessment riskAssessment = new RiskAssessment();
        if(StringUtils.hasText(riskAssessmentDto.getRiskId())){
            riskAssessment = riskAssessmentRepository.findById(riskAssessmentDto.getRiskId()).orElse(riskAssessment);
        }
        riskAssessment.setName(riskAssessmentDto.getName());
        riskAssessment.setScore(Double.valueOf(riskAssessmentDto.getScore()));
        riskAssessment.setEmail(riskAssessmentDto.getEmail());
        riskAssessment.setRisk(riskAssessmentDto.getRisk());
        riskAssessment.setPhone(riskAssessmentDto.getPhone());
        riskAssessment.setTerms(riskAssessmentDto.getTerms());
        riskAssessment = riskAssessmentRepository.save(riskAssessment);
        riskAssessmentDto.setRiskId(riskAssessment.getRiskId());
        return riskAssessmentDto;
    }
}
