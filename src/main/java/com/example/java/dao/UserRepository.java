package com.example.java.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.java.entities.User;

public interface UserRepository extends CrudRepository<User, Integer> {

}
