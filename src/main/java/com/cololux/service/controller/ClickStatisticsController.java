package com.cololux.service.controller;

import com.cololux.service.dto.ClickStatisticsDto;
import com.cololux.service.entity.ClickStatistics;
import com.cololux.service.respository.ClickStatisticsRepository;
import com.cololux.service.service.ClickStatisticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class ClickStatisticsController {
    @Autowired
    private ClickStatisticsService clickStatisticsService;

    @Autowired
    private ClickStatisticsRepository clickStatisticsRepository;

    @PostMapping("/click")
    public ResponseEntity<ClickStatisticsDto> clickStatistics(@RequestBody ClickStatisticsDto clickStatisticsDto) {
        ClickStatisticsDto aDto = clickStatisticsService.saveOrUpdateClick(clickStatisticsDto);
        return new ResponseEntity<>(aDto, HttpStatus.OK);
    }

    @GetMapping("/getClick")
    public List<ClickStatistics> getClickStatistics() {
        return clickStatisticsRepository.findAll();
    }
}
