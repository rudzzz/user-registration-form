package com.registration.form.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.registration.form.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
