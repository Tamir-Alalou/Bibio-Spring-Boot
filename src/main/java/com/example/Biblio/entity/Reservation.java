package com.example.Biblio.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Reservation")
public class Reservation {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long reservation_id;
	private String user_firstname;
	private String user_lastname;
	private String user_email;
	private String book_title;
	private String book_author;
	
	public Reservation() {
			
		}
	public Reservation(String user_firstname, String user_lastname, String user_email, String book_title,
			String book_author) {
		super();
		this.user_firstname = user_firstname;
		this.user_lastname = user_lastname;
		this.user_email = user_email;
		this.book_title = book_title;
		this.book_author = book_author;
	}
	public long getReservation_id() {
		return reservation_id;
	}
	public void setReservation_id(long reservation_id) {
		this.reservation_id = reservation_id;
	}
	public String getUser_firstname() {
		return user_firstname;
	}
	public void setUser_firstname(String user_firstname) {
		this.user_firstname = user_firstname;
	}
	public String getUser_lastname() {
		return user_lastname;
	}
	public void setUser_lastname(String user_lastname) {
		this.user_lastname = user_lastname;
	}
	public String getUser_email() {
		return user_email;
	}
	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}
	public String getBook_title() {
		return book_title;
	}
	public void setBook_title(String book_title) {
		this.book_title = book_title;
	}
	public String getBook_author() {
		return book_author;
	}
	public void setBook_author(String book_author) {
		this.book_author = book_author;
	}
	@Override
	public String toString() {
		return "Reservation [reservation_id=" + reservation_id + ", user_firstname=" + user_firstname
				+ ", user_lastname=" + user_lastname + ", user_email=" + user_email + ", book_title=" + book_title
				+ ", book_author=" + book_author + "]";
	}
	
}
