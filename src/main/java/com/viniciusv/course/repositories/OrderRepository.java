package com.viniciusv.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.viniciusv.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
