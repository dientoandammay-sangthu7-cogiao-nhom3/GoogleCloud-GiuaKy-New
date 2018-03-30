package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;


import com.example.demo.model.User;


public interface UserRepository extends CrudRepository<User, Integer>{
	public User findByUsernameAndPassword(String username, String password);
}