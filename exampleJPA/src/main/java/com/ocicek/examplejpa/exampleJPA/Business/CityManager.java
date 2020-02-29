package com.ocicek.examplejpa.exampleJPA.Business;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;

import com.ocicek.examplejpa.exampleJPA.DataAccess.ICityDal;
import com.ocicek.examplejpa.exampleJPA.Entities.City;

@Service
public class CityManager implements ICityService{

	
	private ICityDal cityDal;
	
	@Autowired
	public CityManager(ICityDal cityDal) {
		this.cityDal = cityDal;
	}
	
	

	public CityManager() {
		
	}



	@Override
	@Transactional
	public List<City> getAll() {
		// TODO Auto-generated method stub
		return this.cityDal.getAll();
	}

	@Override
	@Transactional
	public void add(City city) {
		// TODO Auto-generated method stub
		
		this.cityDal.add(city);
		
	}

	@Override
	@Transactional
	public void update(City city) {
		// TODO Auto-generated method stub
		this.cityDal.update(city);
	}

	@Override
	@Transactional
	public void delete(int id) {
		// TODO Auto-generated method stub
		this.cityDal.delete(id);
		
	}



	@Override
	@Transactional
	public City getById(int id) {
		// TODO Auto-generated method stub
		return this.cityDal.getById(id);
	}

}
