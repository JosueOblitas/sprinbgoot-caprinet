package net.capricornio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.capricornio.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
