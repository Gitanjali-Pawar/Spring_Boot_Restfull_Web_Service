package com.main.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.main.entities.User;

public interface UserRepository extends JpaRepository<User , Integer> {

}
