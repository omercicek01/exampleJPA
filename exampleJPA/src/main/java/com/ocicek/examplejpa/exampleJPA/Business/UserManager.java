package com.ocicek.examplejpa.exampleJPA.Business;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ocicek.examplejpa.exampleJPA.DataAccess.IUserDal;
import com.ocicek.examplejpa.exampleJPA.Entities.User;

@Service
public class UserManager implements IUserService{
	
	IUserDal userDal;

	public UserManager(IUserDal userDal) {
		this.userDal = userDal;
	}

	@Override
	public List<User> getAll() {
		
		return this.userDal.getAll();
	}

	@Override
	public void add(User user) {
		this.userDal.add(user);
		
	}

	@Override
	public void update(User user) {
		this.userDal.update(user);
		
	}

	@Override
	public void delete(int id) {
		this.userDal.delete(id);
		
	}

	@Override
	public User findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
