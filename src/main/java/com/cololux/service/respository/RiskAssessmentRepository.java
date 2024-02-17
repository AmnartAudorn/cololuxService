package com.cololux.service.respository;

import com.cololux.service.entity.Appointment;
import com.cololux.service.entity.RiskAssessment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RiskAssessmentRepository extends JpaRepository<RiskAssessment, String> {
}
