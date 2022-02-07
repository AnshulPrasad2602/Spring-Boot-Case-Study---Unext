package com.anshul.books.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.anshul.books.model.Books;

@Repository
public interface BooksRepository extends JpaRepository<Books, Long>{

}
