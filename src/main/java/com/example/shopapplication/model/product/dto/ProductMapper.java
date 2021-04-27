package com.example.shopapplication.model.product.dto;
import com.example.shopapplication.model.product.Product;
import com.example.shopapplication.model.product.ProductCategory;
import com.example.shopapplication.model.product.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductMapper {

    private final ProductRepository productRepository;

    public ProductDto toDto(Product product){
        ProductDto dto = new ProductDto();
        dto.setId(product.getId());
        dto.setName(product.getName());
        dto.setProductCategory(product.getProductCategory().toString());
        return dto;
    }

    public Product toEntity(ProductDto product){
        Product entity = new Product();
        entity.setId(product.getId());
        entity.setName(product.getName());
        entity.setProductCategory(ProductCategory.valueOf(product.getProductCategory()));

        return entity;
    }

}
