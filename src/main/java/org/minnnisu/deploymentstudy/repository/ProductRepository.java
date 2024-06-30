package org.minnnisu.deploymentstudy.repository;

import org.minnnisu.deploymentstudy.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
