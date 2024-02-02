package com.BookShop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.BookShop.entity.Book;
import com.BookShop.service.BookService;
@CrossOrigin(origins="http://localhost:64229/")
@RestController
public class BookController {
@Autowired
BookService bs;

@PostMapping("/postbook")
public void postB(@RequestBody Book a) {
	 bs.postB(a);
}
@GetMapping("/getbook")
public List<Book> getB(){
	return bs.getB();
}
}
