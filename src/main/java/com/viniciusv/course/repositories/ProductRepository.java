package com.viniciusv.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.viniciusv.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
