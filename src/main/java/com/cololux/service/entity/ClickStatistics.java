package com.cololux.service.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;


@Entity
@Data
@Table(name = "clickStatistics")
public class ClickStatistics {

    @Column(name = "sumHome")
    int sumHome;

    @Column(name = "sumAbout")
    int sumAbout;

    @Column(name = "sumContact")
    int sumContact;

    @Column(name = "sumRisk")
    int sumRisk;

    @Column(name = "sumFacebook")
    int sumFacebook;

    @Column(name = "sumLine")
    int sumLine;

    @Column(name = "sumWechat")
    int sumWechat;

    @Id
    Date date;
}
