package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Book;
import com.example.demo.repo.BookRepo;


@RestController
@CrossOrigin(origins="http://localhost:4200")
public class BookController 
{
	@Autowired
	private BookRepo repo;
	@PostMapping("/book")
	public ResponseEntity<Book>registerUser(@RequestBody Book user) {
		
		System.out.println("Controller Called");
		return ResponseEntity.ok(repo.save(user));
	}

}
