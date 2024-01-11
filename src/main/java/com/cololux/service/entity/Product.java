package com.cololux.service.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Data
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    @Column(name = "product_id", length = 32 ,nullable = false)
    private String productId;

    @Column(name = "product_code", length = 5,nullable = false)
    private String productCode;

    @Column(name = "product_name", length = 10 ,nullable = false)
    private String productName;

    @Column(name = "price" ,nullable = false)
    private double price;

    @Column(name = "details", length = 255)
    private String details;
}
