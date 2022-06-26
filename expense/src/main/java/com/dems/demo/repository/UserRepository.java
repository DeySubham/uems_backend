package com.dems.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dems.demo.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
