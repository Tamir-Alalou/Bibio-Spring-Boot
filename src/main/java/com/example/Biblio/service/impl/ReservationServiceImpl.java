package com.example.Biblio.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Biblio.entity.Reservation;
import com.example.Biblio.repository.ReservationRepository;
import com.example.Biblio.service.ReservationService;

@Service
public class ReservationServiceImpl implements ReservationService {
	
	@Autowired
	ReservationRepository ReservationRepository;

	public ReservationServiceImpl(com.example.Biblio.repository.ReservationRepository reservationRepository) {
		super();
		ReservationRepository = reservationRepository;
	}

	@Override
	public Reservation saveReservation(Reservation reservation) {
		// TODO Auto-generated method stub
		return ReservationRepository.save(reservation);
	}

	@Override
	public List<Reservation> getAllReservation() {
		// TODO Auto-generated method stub
		return ReservationRepository.findAll();
	}

	@Override
	public void cancelReservation(String title) {
		// TODO Auto-generated method stub
		ReservationRepository.deleteByBook_title(title);
		
	}
	

}
