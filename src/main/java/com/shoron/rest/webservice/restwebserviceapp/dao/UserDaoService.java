package com.shoron.rest.webservice.restwebserviceapp.dao;



import java.util.*;
import java.util.List;

import org.springframework.stereotype.Component;

import com.shoron.rest.webservice.restwebserviceapp.model.User;

@Component
public class UserDaoService {
	
	public static List<User> users = new ArrayList<>();
	
	private static int usersCount = 3;
	
	static {
		users.add(new User(1, "Shoron", new Date()));
		users.add(new User(2, "Hasan", new Date()));
		users.add(new User(3, "Shaekh", new Date()));
	}
	
	public List<User> findAll(){
		return users;
	}
	
	public User save(User user) {
		if(user.getId() == null) {
			user.setId(++usersCount);
		}
		users.add(user);
		return user;
	}
	
	public User findOne(int id) {
		for(User user:users) {
			if(user.getId() == id) {
				return user;
			}
		}
		return null;
	}
	
	
}
