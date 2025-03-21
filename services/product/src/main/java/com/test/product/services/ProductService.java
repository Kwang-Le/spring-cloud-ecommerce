package com.test.product.services;

import com.test.product.controllers.dtos.CreateProductRequest;
import com.test.product.controllers.dtos.ProductPurchaseRequest;
import com.test.product.controllers.dtos.ProductPurchaseResponse;
import com.test.product.entities.Product;
import com.test.product.repositories.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService implements IProductService {

    private final ProductRepository productRepository;

    @Override
    public Product getProduct(Integer id) {
        return productRepository.findById(id).orElseThrow(RuntimeException::new);
    }

    @Override
    public Product createProduct(CreateProductRequest request) {
        return null;
    }

    @Override
    public List<ProductPurchaseResponse> purchaseProduct(List<ProductPurchaseRequest> requests) {
        return List.of();
    }

    @Override
    public List<Product> findAllProducts() {
        return List.of();
    }
}
