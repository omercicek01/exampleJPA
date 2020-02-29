 package com.ocicek.examplejpa.exampleJPA.Business;

import java.util.List;

import com.ocicek.examplejpa.exampleJPA.Entities.City;

public interface ICityService {
	

	List<City> getAll();
	void add(City city);
	void update(City city);
	void delete(int id);
	City getById(int id);

}
