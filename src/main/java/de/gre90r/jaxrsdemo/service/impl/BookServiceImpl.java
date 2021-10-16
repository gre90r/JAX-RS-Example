package de.gre90r.jaxrsdemo.service.impl;

import java.util.Set;
import java.util.TreeSet;

import javax.ejb.Singleton;

import de.gre90r.jaxrsdemo.dto.Book;
import de.gre90r.jaxrsdemo.service.BookService;

@Singleton
public class BookServiceImpl implements BookService {

	private final Set<Book> books = new TreeSet<Book>();
	{
		this.books.add(new Book(1, "Herr der Ringe", "J. R. R. Tolkien", "Klett Cotta"));
		this.books.add(new Book(2, "Shining", "Stephen King", "Lübbe"));
		this.books.add(new Book(3, "Das Buch der verschollenen Namen", "Kristin Harmel", "Knaur"));
	}
	
	
	@Override
	public Book getBookById(int id) {
		for (Book book : this.books) {
			if (book.getId() == id) {
				return book;
			}
		}
		return null;
	}

	@Override
	public Set<Book> getAllBooks() {
		
		return this.books;
	}

	@Override
	public boolean addBook(Book book) {
		
		return this.books.add(new Book(book));
	}

}
