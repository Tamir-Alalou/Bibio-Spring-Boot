package com.example.Biblio.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.Biblio.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long>{

	@Query(value = "SELECT new com.example.Biblio.entity.Book(b.title,b.author,b.release_year, b.edition)  FROM Book b where b.reservedby_id=0")
	List<Book> findByreservedbyId();

	@Transactional
	@Modifying
	@Query(value = "Update Book b set b.reservedby_id=?2 where b.title=?1")
	void setReservedBy_Id(String book_title, long i);

	@Transactional
	@Modifying
	@Query(value = "delete from Book b where b.title=?1")
	void deleteByTitle(String titre);

}
