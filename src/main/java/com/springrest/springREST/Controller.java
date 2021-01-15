package com.springrest.springREST;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springREST.model.User;
import com.springrest.springREST.service.UserService;


@RestController()
public class Controller {
	
	public class ControllerUser {
		
		@Autowired
		private UserService s;

		@GetMapping("/user")
		public List<User> retriveAll() {
			return s.findAll();
		}
		
		@GetMapping("/user/{id}")
		public User findOne(@PathVariable int id) {
			User us = s.findOne(id);
//			if(us==null) {
//				throw new UserNotFoundException("id"+id);
//			}
			return us;
		}
		@PostMapping("/user")
		public User createUser(@RequestBody User us) {
			User savedUs = s.save(us);
//			URI location = ServletUriComponentsBuilder
//					.fromCurrentRequest()
//					.path("/{id}")
//					.buildAndExpand(savedUs.getId()).toUri();
//			return ResponseEntity.created(location).build();
			return savedUs;
			
			
		}
		@DeleteMapping("/user/{id}")
		public void deleteUser(@PathVariable int id) {
			User us = s.deleteById(id);
//			if(us==null) {
//				throw new UserNotFoundException("id"+id);
//			}
		}}
	}
