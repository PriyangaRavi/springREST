package com.springrest.springREST.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springrest.springREST.model.User;


@Service
public class UserService {
	
	private static List<User> user = new ArrayList<>();
	private static int c=2;
	static {
		user.add(new User(1,"Adam",new Date()));
		user.add(new User(2,"Eve",new Date()));
	}
	
	public List<User> findAll(){
		return user;
	}
	public User save(User us) {
		if(us.getId()==null) {
			us.setId(++c);
		}
		user.add(us);
		return us;
	}
	public User findOne(int id) {
		for(User us: user) {
			if(us.getId()==id) {
			return us;
			}
		}
		return null;
	}
	public User deleteById(int id) {
		Iterator<User> itr = user.iterator();
		while(itr.hasNext()) {
			User us=itr.next();
			if(us.getId()==id) {
					itr.remove();
					return us;
				}
			}
			return null;
		}
		
	}
		
	
	

	