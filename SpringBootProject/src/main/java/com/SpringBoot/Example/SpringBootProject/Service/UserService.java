package com.SpringBoot.Example.SpringBootProject.Service;

import java.util.List;

import com.SpringBoot.Example.SpringBootProject.Entity.UserEntity;

public interface UserService {
	
	public List<UserEntity> getUserList();
	public UserEntity getUser(int id);
	public void addUser(UserEntity userEntity);
	public void updateUser(int id, UserEntity userEntity);
	public void deleteUser(int id);

}
