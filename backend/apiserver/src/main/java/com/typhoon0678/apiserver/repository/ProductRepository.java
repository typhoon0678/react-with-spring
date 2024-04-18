package com.typhoon0678.apiserver.repository;

import com.typhoon0678.apiserver.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
