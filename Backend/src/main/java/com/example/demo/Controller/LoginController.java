package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Login;
import com.example.demo.repo.LoginRepo;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class LoginController 
{
	@Autowired
	private LoginRepo repo;
	@PostMapping("/login")
	public ResponseEntity<Login>registerUser(@RequestBody Login user) {
		
		System.out.println("Controller Called");
		return ResponseEntity.ok(repo.save(user));
	}

}
