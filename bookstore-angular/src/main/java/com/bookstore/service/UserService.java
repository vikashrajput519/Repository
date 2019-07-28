package com.bookstore.service;

import java.util.Set;

import com.bookstore.domain.User;
import com.bookstore.domain.security.UserRole;

public interface UserService {
	
	public abstract User createUser(User user, Set<UserRole> userRoles);
	
}
