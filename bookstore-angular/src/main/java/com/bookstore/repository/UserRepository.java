package com.bookstore.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.bookstore.domain.User;

public interface UserRepository extends CrudRepository<User, Long>{
	
	public abstract User findByUsername(String username);
	
	public abstract User findByEmail(String email);
	
	public abstract List<User> findAll();

}
