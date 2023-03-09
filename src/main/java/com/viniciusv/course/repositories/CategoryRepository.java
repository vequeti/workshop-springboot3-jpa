package com.viniciusv.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.viniciusv.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
