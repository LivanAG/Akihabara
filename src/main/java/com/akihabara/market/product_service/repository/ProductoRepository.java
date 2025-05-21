package com.akihabara.market.product_service.repository;

import com.akihabara.market.product_service.model.ProductoOtaku;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<ProductoOtaku,Long> {
}
