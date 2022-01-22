package com.example.Biblio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.Biblio.entity.Book;
import com.example.Biblio.service.BookService;

@Controller
public class BookController {
	
	private BookService BookService;

	public BookController(com.example.Biblio.service.BookService bookService) {
		super();
		BookService = bookService;
	}
	@GetMapping("/books")
	public String listStudents(Model model) {
		model.addAttribute("books", BookService.getAllBooks());
		return "books";
	}
	@GetMapping("/book/new")
	public String AddBook(Model model) {
		Book book = new Book();
		model.addAttribute("book", book);
		return "create_book";
	}
	@PostMapping("/book/new")
	public String saveReservation(@ModelAttribute("book") Book book) {
		BookService.saveBook(book);
		return "redirect:/books_a";
	}
	@GetMapping("/book/supprimer/{titre}")
	public String AnnulerReservation(@PathVariable String titre) {
		BookService.deleteBook(titre);
		return "redirect:/books_a";
	}
}
