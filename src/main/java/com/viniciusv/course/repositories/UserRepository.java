package com.viniciusv.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.viniciusv.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
