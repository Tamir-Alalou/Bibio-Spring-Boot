package com.example.Biblio.service;

import java.util.List;

import com.example.Biblio.entity.Reservation;

public interface ReservationService {

	Reservation saveReservation(Reservation reservation);

	List<Reservation> getAllReservation();

	void cancelReservation(String title);

}
