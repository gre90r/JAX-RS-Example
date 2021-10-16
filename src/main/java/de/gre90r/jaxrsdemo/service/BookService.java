package de.gre90r.jaxrsdemo.service;

import java.util.Set;

import de.gre90r.jaxrsdemo.dto.Book;

public interface BookService {
	
	public Set<Book> getAllBooks();
	public Book getBookById(int id);
	public boolean addBook(Book book);

}
