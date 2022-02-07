package com.anshul.books.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.anshul.books.model.Books;
import com.anshul.books.service.BooksService;

@RestController
@RequestMapping("/api")
public class BooksController {
	@Autowired
	BooksService bookService;

	@RequestMapping(value = "/books", method = RequestMethod.POST)
	public Books createBook(@RequestBody Books book) {
		return bookService.createBook(book);
	}

	@RequestMapping(value = "/books", method = RequestMethod.GET)
	public List<Books> readBooks() {
		return bookService.getBooks();
	}

	@RequestMapping(value = "/books/{bookID}", method = RequestMethod.PUT)
	public Books readBooks(@PathVariable(value = "bookID") Long id, @RequestBody Books bookDetails) {
		return bookService.updateBook(id, bookDetails);
	}

	@RequestMapping(value = "/books/{bookID}", method = RequestMethod.DELETE)
	public void deleteBooks(@PathVariable(value = "bookID") Long id) {
		bookService.deleteBook(id);
	}

}
