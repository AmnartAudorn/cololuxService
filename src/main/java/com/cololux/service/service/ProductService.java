package com.cololux.service.service;


import com.cololux.service.dto.ProductDto;
import com.cololux.service.entity.Product;
import com.cololux.service.respository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
public class ProductService {
    @Autowired
    private ProductRepository prepo;

    public ProductDto getProductByCode(String productId){
        Product product = prepo.findById(productId).get();
        ProductDto productDto = new ProductDto();
        productDto.setProductId(product.getProductId());
        productDto.setProductName(product.getProductName());
        productDto.setProductCode(product.getProductCode());
        productDto.setPrice(product.getPrice());
        productDto.setDetails(product.getDetails());
        return productDto;
    }
    public ProductDto saveProduct(ProductDto productDto) {
        Product product = new Product();
        if(StringUtils.hasText(productDto.getProductId())){
             product = prepo.findById(productDto.getProductId()).orElse(product);
        }
        product.setProductCode(productDto.getProductCode());
        product.setProductName(productDto.getProductName());
        product.setPrice(productDto.getPrice());
        product.setDetails(productDto.getDetails());
        product = prepo.save(product);
        productDto.setProductId(product.getProductId());
        return productDto;
    }

    public void deleteProduct(String productId) {
        prepo.deleteById(productId);
    }


}
