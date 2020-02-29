package com.ocicek.examplejpa.exampleJPA.RestApi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ocicek.examplejpa.exampleJPA.Business.ICityService;
import com.ocicek.examplejpa.exampleJPA.Entities.City;

@RestController
@RequestMapping("/api")
public class CityController {

	private ICityService cityService;

	@Autowired
	public CityController(ICityService cityService) {
		this.cityService = cityService;
	}
	
	@GetMapping("/cities")
	public List<City> get() {
		return cityService.getAll();
		
	}
	
	@PostMapping("/cities/add")
	public void add(@RequestBody City city) {
		this.cityService.add(city);
	}
	
	
	@PostMapping("/cities/update")
	public void update(@RequestBody City city) {
		this.cityService.update(city);
	}
	
	@PostMapping("/cities/delete/{id}")
	public void delete(@PathVariable int id) {
		this.cityService.delete(id);
	}
	
	
	@GetMapping("/cities/{id}")
	public City getById(@PathVariable int id) {
		return this.cityService.getById(id);
	}
	
}
