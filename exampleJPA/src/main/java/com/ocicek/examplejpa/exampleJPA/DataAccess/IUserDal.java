package com.ocicek.examplejpa.exampleJPA.DataAccess;

import java.util.List;

import com.ocicek.examplejpa.exampleJPA.Entities.User;

public interface IUserDal {
	
	List<User> getAll();
	void add(User user);
	void update(User user);
	void delete(int id);
	User findById(int id);

}
