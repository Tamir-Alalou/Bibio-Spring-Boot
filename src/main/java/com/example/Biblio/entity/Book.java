package com.example.Biblio.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Book")
public class Book {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long book_id;
	
	@Column(name = "title")
	private String title;
	@Column(name = "author")
	private String author;
	@Column(name = "release_year")
	private int release_year;
	@Column(name = "edition")
	private int edition;
	@Column(name = "reservedby_id")
	private long reservedby_id  = 0;
	
	public Book() {
		
	}

	public Book(String title, String author, int release_year, int edition, long reservedby_id) {
		super();
		this.title = title;
		this.author = author;
		this.release_year = release_year;
		this.edition = edition;
		this.reservedby_id = reservedby_id;
	}
	public Book(String title, String author, int release_year, int edition) {
		super();
		this.title = title;
		this.author = author;
		this.release_year = release_year;
		this.edition = edition;
	}
	public Book(String title, String author) {
		super();
		this.title = title;
		this.author = author;
	}

	public long getBook_id() {
		return book_id;
	}

	public void setBook_id(long book_id) {
		this.book_id = book_id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getRelease_year() {
		return release_year;
	}

	public void setRelease_year(int release_year) {
		this.release_year = release_year;
	}

	public int getEdition() {
		return edition;
	}

	public void setEdition(int edition) {
		this.edition = edition;
	}

	public long getReservedby_id() {
		return reservedby_id;
	}

	public void setReservedby_id(long reservedby_id) {
		this.reservedby_id = reservedby_id;
	}

	@Override
	public String toString() {
		return "Book [book_id=" + book_id + ", title=" + title + ", author=" + author + ", release_year=" + release_year
				+ ", edition=" + edition + ", reservedby_id=" + reservedby_id + "]";
	}
	
	
	
}
