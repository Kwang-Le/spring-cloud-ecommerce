package com.test.product.services;


import com.test.product.controllers.dtos.CreateProductRequest;
import com.test.product.controllers.dtos.ProductPurchaseRequest;
import com.test.product.controllers.dtos.ProductPurchaseResponse;
import com.test.product.entities.Product;

import java.util.List;

public interface IProductService {

    Product getProduct(Integer id);

    Product createProduct(CreateProductRequest request);

    List<ProductPurchaseResponse> purchaseProduct(List<ProductPurchaseRequest> requests);

    List<Product> findAllProducts();
}
