package com.BookShop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BookShop.dao.BookDao;
import com.BookShop.entity.Book;

@Service
public class BookService {
	@Autowired
	BookDao bd;

	public void postB(Book b) {
		Book a=b;
		//b.setTotal((b.getPrice()+b.getTax())-b.getDiscount());
		a.setTotal((a.getPrice()+a.getPrice()*a.getTax()/100)-(a.getPrice()*a.getDiscount()/100));
		
		 bd.postB(a);
	}

	public List<Book> getB() {
		return bd.getB();
	}
}