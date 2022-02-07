package com.anshul.books.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "books")
public class Books {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "bookid")
	private Long bookId;

	@Column(name = "name")
	private String bookName;

	@Column(name = "author")
	private String bookAuthor;

	@Column(name = "publisher")
	private String bookPublisher;

	@Column(name = "quantity")
	private Long bookQuantity;

	public Long getBookId() {
		return bookId;
	}

	public void setBookId(Long bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	public String getBookPublisher() {
		return bookPublisher;
	}

	public void setBookPublisher(String bookPublisher) {
		this.bookPublisher = bookPublisher;
	}

	public Long getBookQuantity() {
		return bookQuantity;
	}

	public void setBookQuantity(Long bookQuantity) {
		this.bookQuantity = bookQuantity;
	}

	
}
