package com.SpringBoot.Example.SpringBootProject.DOA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.SpringBoot.Example.SpringBootProject.Entity.UserEntity;

@Repository
public class UserDoaIMP implements UserDoa {

	
	
	private List<UserEntity> list =new ArrayList<UserEntity>(Arrays.asList(new UserEntity(1,"kesharwaniraj@gmail.com", 96436965),
			new UserEntity(4,"raj@gmail.com", 436965),
			new UserEntity(2,"kesharwani@gmail.com", 964365),
			new UserEntity(3,"kumar@gmail.com", 9643696)));
	
	
	@Override
	public List<UserEntity> getUserList() {
		return list;
	}




	@Override
	public UserEntity getUser(int id) {
		
		for(UserEntity en : list)
		{
			if(en.getId() == id)
			{
				return en;
			}
		}
		return null;
	}




	@Override
	public void addUser(UserEntity userEntity) {
		list.add(userEntity);
		
	}




	@Override
	public void updateUser(int id, UserEntity userEntity) {
		
		for(UserEntity e : list)
		{
			if(e.getId() == id)
			{
				list.set(id, userEntity);
			}
		}
	}




	@Override
	public void deleteUser(int id) {
		
	list.removeIf(t-> t.getId() == id);
		
	}

}
