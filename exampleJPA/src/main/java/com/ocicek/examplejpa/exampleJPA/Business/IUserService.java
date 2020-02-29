package com.ocicek.examplejpa.exampleJPA.Business;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ocicek.examplejpa.exampleJPA.Entities.User;

public interface IUserService {

	List<User> getAll();
	void add(User user);
	void update(User user);
	void delete(int id);
	User findById(int id);
	
}
