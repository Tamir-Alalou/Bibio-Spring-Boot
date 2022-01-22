package com.example.Biblio.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Biblio.entity.Book;
import com.example.Biblio.repository.BookRepository;
import com.example.Biblio.service.BookService;

@Service
public class BookServiceImpl implements BookService {
	

	@Autowired
	BookRepository bookRepo;
	
	public BookServiceImpl(BookRepository bookRepo) {
		super();
		this.bookRepo = bookRepo;
	}

	public List<Book> getAllBooks(){
		return bookRepo.findByreservedbyId();
	}

	@Override
	public Book saveBook(Book book) {
		// TODO Auto-generated method stub
		return bookRepo.save(book);
	}

	@Override
	public void changeReservationStatus(String book_title,long i) {
		// TODO Auto-generated method stub
		bookRepo.setReservedBy_Id(book_title,i);
	}

	@Override
	public void deleteBook(String titre) {
		// TODO Auto-generated method stub
		bookRepo.deleteByTitle(titre);
	}


	
	
	
}
