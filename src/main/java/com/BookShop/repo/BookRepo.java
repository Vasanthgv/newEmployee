package com.BookShop.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.BookShop.entity.Book;

public interface BookRepo extends JpaRepository<Book,Integer> {

}
