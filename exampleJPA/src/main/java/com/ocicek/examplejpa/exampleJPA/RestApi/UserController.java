package com.ocicek.examplejpa.exampleJPA.RestApi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ocicek.examplejpa.exampleJPA.Business.IUserService;
import com.ocicek.examplejpa.exampleJPA.Entities.User;

@RestController
@RequestMapping("/api")
public class UserController {
	
	
   IUserService userService;

   @Autowired
	public UserController(IUserService userService) {
		this.userService = userService;
	}

   @GetMapping("/users")
	public List<User>getAll(){
		
	   return this.userService.getAll();
	}
   
   
   @PostMapping("/user/add")
	public void add(@RequestBody User user){
		
	   this.userService.add(user);
	}
   
   @PostMapping("/user/update")
	public void update(@RequestBody User user){
		
	   this.userService.add(user);
	}
   
  
   @PostMapping("/user/delete/{id}")
	public void add(@PathVariable int id){
		
	   this.userService.delete(id);
	}
   
   
}
