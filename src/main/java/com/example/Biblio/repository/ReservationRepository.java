package com.example.Biblio.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.Biblio.entity.Reservation;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation,Long>{

	@Transactional
	@Modifying
	@Query(value = "Delete  FROM Reservation r where r.book_title=?1")
	void deleteByBook_title(String title);

}
