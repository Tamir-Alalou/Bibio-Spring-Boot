package com.example.Biblio.service;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import com.example.Biblio.entity.Book;


public interface BookService {

	@Query
	List<Book> getAllBooks();

	Book saveBook(Book book);

	void changeReservationStatus(String book_title, long i);

	void deleteBook(String titre);
	
}