package com.example.Biblio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.Biblio.entity.User;
import com.example.Biblio.service.BookService;
import com.example.Biblio.service.UserService;

@Controller
public class UserController {
	
	private UserService UserService;
	private BookService BookService;
	
	
	public UserController(com.example.Biblio.service.UserService userService,
			com.example.Biblio.service.BookService bookService) {
		super();
		UserService = userService;
		BookService = bookService;
	}

	@GetMapping("/identification")
	public String Identification(Model model) {
		User user = new User();
		model.addAttribute("user", user);
		return "identification";
	}
	
	@PostMapping("/identification")
	public String saveReservation(@ModelAttribute("user") User user) {
		if ((user.getUsername().equals("admin")) && (user.getPassword().equals("admin"))){
			return "redirect:/books_a";
		}
		return "redirect:/books";
	}
	@GetMapping("/books_a")
	public String listStudents(Model model) {
		model.addAttribute("books", BookService.getAllBooks());
		return "books_a";
	}
}
