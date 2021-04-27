package com.example.shopapplication.model.product;

import com.example.shopapplication.model.product.dto.ProductDto;
import com.example.shopapplication.model.product.dto.ProductMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;
    private final ProductMapper productMapper;

    public List<ProductDto> findAll(){
        return productRepository.findAll()
                .stream()
                .map(productMapper::toDto)
                .collect(Collectors.toList());
    }

    public Optional<ProductDto> findById(Long id){
        return productRepository.findById(id).map(productMapper::toDto);
    }

    public void removeById(Long id){
        productRepository.deleteById(id);
    }

    public ProductDto createOrUpdate(ProductDto product){
        Product productEntity = productMapper.toEntity(product);
        Product savedProduct = productRepository.save(productEntity);
        return productMapper.toDto(savedProduct);
    }

}
