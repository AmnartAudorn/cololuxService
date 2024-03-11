package com.cololux.service.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.sql.Date;


@Data
@ToString
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class ClickStatisticsDto {
    private int sumHome;
    private int sumAbout;
    private int sumContact;
    private int sumRick;
    private int sumFacebook;
    private int sumLine;
    private int sumWechat;
    private Date date;


    public ClickStatisticsDto(int sumHome,int sumAbout, int sumContact,
                              int sumRick,int sumFacebook, int sumLine,
                              int sumWechat,Date date) {
        super();
        this.sumAbout = sumAbout;
        this.sumContact = sumContact;
        this.sumRick = sumRick;
        this.sumFacebook = sumFacebook;
        this.sumLine = sumLine;
        this.sumWechat = sumWechat;
        this.date = date;
    }
}
