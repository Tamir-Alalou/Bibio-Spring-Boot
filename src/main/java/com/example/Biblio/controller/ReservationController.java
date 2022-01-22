package com.example.Biblio.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.Biblio.entity.Reservation;
import com.example.Biblio.service.BookService;
import com.example.Biblio.service.ReservationService;

@Controller
public class ReservationController {

	private ReservationService ReservationService;
	private BookService BookService;

	public ReservationController(com.example.Biblio.service.ReservationService reservationService,com.example.Biblio.service.BookService bookservice) {
		super();
		ReservationService = reservationService;
		BookService = bookservice;
	}
	@GetMapping("/reservations/new")
	public String createReservationForm(Model model) {
		Reservation reservation = new Reservation();
		model.addAttribute("reservation", reservation);
		return "create_reservation";
	}
	@PostMapping("/reservation")
	public String saveReservation(@ModelAttribute("reservation") Reservation reservation) {
		ReservationService.saveReservation(reservation);
		BookService.changeReservationStatus(reservation.getBook_title(),1);
		return "redirect:/books";
	}
	@GetMapping("/reservation_v")
	public String getReservations(Model model) {
		List<Reservation> reservations = ReservationService.getAllReservation();
		model.addAttribute("reservations", reservations);
		return "reservation";
	}
	@GetMapping("/reservation/annuler/{titre}")
	public String AnnulerReservation(@PathVariable String titre) {
		ReservationService.cancelReservation(titre);
		BookService.changeReservationStatus(titre,0);
		return "redirect:/reservation_v";
	}
}
