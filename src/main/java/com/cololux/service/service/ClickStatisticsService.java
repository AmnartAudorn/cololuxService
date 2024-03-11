package com.cololux.service.service;

import com.cololux.service.dto.ClickStatisticsDto;
import com.cololux.service.entity.ClickStatistics;
import com.cololux.service.respository.ClickStatisticsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.Optional;

@Service
public class ClickStatisticsService {
    @Autowired
    private ClickStatisticsRepository prepo;
    public ClickStatisticsDto saveOrUpdateClick(ClickStatisticsDto clickStatisticsDto) {
        ClickStatistics clickStatistics = new ClickStatistics();
        Date date = new Date(System.currentTimeMillis());
        Optional<ClickStatistics> byIds = prepo.findById(date);
        if(!byIds.isEmpty()) {
            ClickStatistics byId = byIds.get();
            if (clickStatisticsDto.getSumAbout() > 0) {
                clickStatisticsDto.setSumAbout(byId.getSumAbout() + clickStatisticsDto.getSumAbout());
            } else {
                clickStatisticsDto.setSumAbout(byId.getSumAbout());
            }

            if (clickStatisticsDto.getSumHome() > 0) {
                clickStatisticsDto.setSumHome(byId.getSumHome() + clickStatisticsDto.getSumHome());
            } else {
                clickStatisticsDto.setSumHome(byId.getSumHome());
            }

            if (clickStatisticsDto.getSumContact() > 0) {
                clickStatisticsDto.setSumContact(byId.getSumContact() + clickStatisticsDto.getSumContact());
            } else {
                clickStatisticsDto.setSumContact(byId.getSumContact());
            }

            if (clickStatisticsDto.getSumRick() > 0) {
                clickStatisticsDto.setSumRick(byId.getSumRisk() + clickStatisticsDto.getSumRick());
            } else {
                clickStatisticsDto.setSumRick(byId.getSumRisk());
            }

            if (clickStatisticsDto.getSumFacebook() > 0) {
                clickStatisticsDto.setSumFacebook(byId.getSumFacebook() + clickStatisticsDto.getSumFacebook());
            } else {
                clickStatisticsDto.setSumFacebook(byId.getSumFacebook());
            }

            if (clickStatisticsDto.getSumLine() > 0) {
                clickStatisticsDto.setSumLine(byId.getSumLine() + clickStatisticsDto.getSumLine());
            } else {
                clickStatisticsDto.setSumLine(byId.getSumLine());
            }

            if (clickStatisticsDto.getSumWechat() > 0) {
                clickStatisticsDto.setSumWechat(byId.getSumWechat() + clickStatisticsDto.getSumWechat());
            } else {
                clickStatisticsDto.setSumWechat(byId.getSumWechat());
            }
        }
        clickStatistics.setSumHome(clickStatisticsDto.getSumHome());
        clickStatistics.setSumAbout(clickStatisticsDto.getSumAbout());
        clickStatistics.setSumContact(clickStatisticsDto.getSumContact());
        clickStatistics.setSumRisk(clickStatisticsDto.getSumRick());
        clickStatistics.setSumFacebook(clickStatisticsDto.getSumFacebook());
        clickStatistics.setSumLine(clickStatisticsDto.getSumLine());
        clickStatistics.setSumWechat(clickStatisticsDto.getSumWechat());
        clickStatistics.setDate(date);
        clickStatistics = prepo.save(clickStatistics);
        clickStatisticsDto.setDate(date);
        return clickStatisticsDto;
    }
}
