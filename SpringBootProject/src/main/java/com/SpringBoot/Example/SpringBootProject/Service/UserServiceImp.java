package com.SpringBoot.Example.SpringBootProject.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringBoot.Example.SpringBootProject.DOA.UserDoa;
import com.SpringBoot.Example.SpringBootProject.Entity.UserEntity;

@Service
public class UserServiceImp implements UserService {

	@Autowired
	private UserDoa userDoa;
	
	@Override
	public List<UserEntity> getUserList() {
		return userDoa.getUserList();
	}

	@Override
	public UserEntity getUser(int id) {
		
		return userDoa.getUser(id);
	}

	public void addUser(UserEntity userEntity) {
		userDoa.addUser(userEntity);
	}

	@Override
	public void updateUser(int id, UserEntity userEntity) {
		
		userDoa.updateUser(id , userEntity);
	}

	@Override
	public void deleteUser(int id) {
		userDoa.deleteUser(id);
		
	}

}
