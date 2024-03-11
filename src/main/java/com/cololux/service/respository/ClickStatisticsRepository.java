package com.cololux.service.respository;

import com.cololux.service.entity.ClickStatistics;
import org.springframework.data.jpa.repository.JpaRepository;

import java.sql.Date;


public interface ClickStatisticsRepository extends JpaRepository<ClickStatistics, Date> {
}
