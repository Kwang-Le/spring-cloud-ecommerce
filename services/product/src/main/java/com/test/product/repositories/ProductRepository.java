package com.test.product.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.test.product.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
