package com.SpringBoot.Example.SpringBootProject.Controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.SpringBoot.Example.SpringBootProject.Entity.UserEntity;
import com.SpringBoot.Example.SpringBootProject.Service.UserServiceImp;

@RestController
public class Registration {
	
	@Autowired
	private UserServiceImp userService;
	
	@RequestMapping("/list")
	public List<UserEntity> getUserList()
	{
		return userService.getUserList();
	}

	
	@RequestMapping("/list/{id}")
	public UserEntity getuser(@PathVariable int id)
	{
		return userService.getUser(id);
	}
	
	
	@RequestMapping(method=RequestMethod.POST,value="/list")
	public void addUser(@RequestBody UserEntity userEntity)
	{
		userService.addUser(userEntity);
	}
	
	
	@RequestMapping(method=RequestMethod.PUT,value="/list/{id}")
	public void updateUser(@RequestBody UserEntity userEntity , @PathVariable int id)
	{
		userService.updateUser(id , userEntity);
	}
	
	
	@RequestMapping(method=RequestMethod.DELETE,value="/list/{id}")
	public void deleteUser(@PathVariable int id)
	{
		userService.deleteUser(id);
	}
	
	
}


