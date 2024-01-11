package com.cololux.service.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

@Data
@ToString
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductDto implements Serializable {

    private String productId;
    private String productCode;
    private String productName;
    private double price;
    private String details;

    public ProductDto(String productId, String productCode,
                      String productName,
                      double price,
                      String details) {
        super();
        this.productId = productId;
        this.productCode = productCode;
        this.productName = productName;
        this.price = price;
        this.details = details;
    }


}