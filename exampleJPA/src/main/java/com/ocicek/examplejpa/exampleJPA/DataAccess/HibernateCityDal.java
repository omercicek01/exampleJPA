package com.ocicek.examplejpa.exampleJPA.DataAccess;

import java.util.List;

import javax.persistence.EntityManager;


import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ocicek.examplejpa.exampleJPA.Entities.City;

//JPA - ORM
@Repository
public class HibernateCityDal implements ICityDal{

	
	private EntityManager entityManager;
	
	@Autowired
	public HibernateCityDal(EntityManager entityManager) {
	
		this.entityManager = entityManager;
	}

	@Override
	@Transactional
	public List<City> getAll() {
		Session session= entityManager.unwrap(Session.class);
		List<City> cities= session.createQuery("from City",City.class).getResultList();
		return cities;
	}

	@Override
	@Transactional
	public void add(City city) {
		
		Session session= entityManager.unwrap(Session.class);
		session.saveOrUpdate(city);
		
	}

	@Override
	@Transactional
	public void update(City city) {

		Session session= entityManager.unwrap(Session.class);
		session.saveOrUpdate(city);
		
	}

	@Override
	@Transactional
	public void delete(int id) {
		Session session= entityManager.unwrap(Session.class);
		City city=session.get(City.class,id);
		session.delete(city);
		
	}

	@Override
	public City getById(int id) {

		Session session= entityManager.unwrap(Session.class);
		City city=session.get(City.class,id);
		return city;
	}

}
