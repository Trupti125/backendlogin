package com.psl.miniproject21.db;

import org.springframework.data.jpa.repository.JpaRepository;

import com.psl.miniproject21.model.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
}