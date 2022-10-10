package com.sparta.week04.controller;

import com.sparta.week04.domain.Product;
import com.sparta.week04.domain.ProductRepository;
import com.sparta.week04.dto.ProductMypriceRequestDto;
import com.sparta.week04.dto.ProductRequestDto;
import com.sparta.week04.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RequiredArgsConstructor  // final로 선언된 멤버 변수를 자동으로 생성
@RestController
public class ProductRestController {
    private final ProductService productService;
    private final ProductRepository productRepository;

    // 등록된 전체 상품 목록 조회
    @GetMapping("/api/products")
    public List<Product> getProducts() {
        return productRepository.findAll();
    }

    // 신규 상품 등록
    @PostMapping("/api/products")
    public Product createProduct(@RequestBody ProductRequestDto requestDto) {
        Product product = new Product(requestDto);
        productRepository.save(product);
        return product;
    }

    // 최저가 변경
    @PutMapping("/api/products/{id}")
    public Long updatePrice(@PathVariable Long id, @RequestBody ProductMypriceRequestDto requestDto) {
        return productService.update(id, requestDto);
    }
}
