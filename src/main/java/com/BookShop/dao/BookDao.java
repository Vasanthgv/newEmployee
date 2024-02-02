package com.BookShop.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.BookShop.entity.Book;
import com.BookShop.repo.BookRepo;

@Repository
public class BookDao {
@Autowired
BookRepo br;

public void postB(Book a) {
	br.save(a);
	
}

public List<Book> getB() {
	
	return br.findAll();
}
}
