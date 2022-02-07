package com.anshul.books.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anshul.books.model.Books;
import com.anshul.books.repository.BooksRepository;
import java.util.List;

@Service
public class BooksService {

	@Autowired
	BooksRepository bookRepository;

	// CREATE
	public Books createBook(Books book) {
		return bookRepository.save(book);
	}

	// READ
	public List<Books> getBooks() {
		return bookRepository.findAll();
	}

	// DELETE
	public void deleteBook(Long bookId) {
		bookRepository.deleteById(bookId);
	}

	// UPDATE
	public Books updateBook(Long bookID, Books bookDetails) {
		Books book = bookRepository.findById(bookID).get();
		book.setBookName(bookDetails.getBookName());
		book.setBookAuthor(bookDetails.getBookAuthor());
		book.setBookPublisher(bookDetails.getBookPublisher());
		book.setBookQuantity(bookDetails.getBookQuantity());

		return bookRepository.save(book);
	}
}
