package com.ocicek.examplejpa.exampleJPA.DataAccess;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ocicek.examplejpa.exampleJPA.Entities.User;

@Repository
public class HıbernateUserDal implements IUserDal {

	EntityManager entityManager;
	
	public HıbernateUserDal(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	
	
	
	
	@Override
	@Transactional
	public List<User> getAll() {
		Session session= entityManager.unwrap(Session.class);
		List<User> users= session.createQuery("from User" , User.class).getResultList();
		return users;
	}

	@Override
	public void add(User user) {
		
		Session session= entityManager.unwrap(Session.class);
		session.saveOrUpdate(user);
		
		
	}

	@Override
	public void update(User user) {
		
		Session session= entityManager.unwrap(Session.class);
		session.saveOrUpdate(user);
		
	}

	@Override
	public void delete(int id) {


		Session session= entityManager.unwrap(Session.class);
		User user=session.get(User.class, id);
		session.delete(user);
		
	}

	@Override
	public User findById(int id) {
		Session session= entityManager.unwrap(Session.class);
		User user=session.get(User.class, id);
		return user;
	}

}
