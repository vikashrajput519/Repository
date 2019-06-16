package com.bookstore.domain.security;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.bookstore.domain.User;

@Entity
@Table(name="USERROLE")
public class UserRole {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String userRoleId;
	
	private Role role;
	private User user;
	
	public UserRole(User user, Role role)
	{
		this.user = user;
		this.role = role;
	}

}
