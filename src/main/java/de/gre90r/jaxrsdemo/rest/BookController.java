package de.gre90r.jaxrsdemo.rest;

import java.util.Set;

import javax.ejb.Singleton;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import de.gre90r.jaxrsdemo.dto.Book;
import de.gre90r.jaxrsdemo.service.BookService;
import de.gre90r.jaxrsdemo.service.impl.BookServiceImpl;

@Singleton
@Path("/books")
public class BookController {

	private final BookService bookService = new BookServiceImpl();
	
	// http://localhost:8080/jax-rs-demo/api/books
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Set<Book> getAllBooks() {
		return this.bookService.getAllBooks();
	}
	
	// http://localhost:8080/jax-rs-demo/api/books/1
	@GET
	@Path("/{bookId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Book getBookById(@PathParam("bookId") int bookId) {
		
		return this.bookService.getBookById(bookId);
	}
	
	// http://localhost:8080/jax-rs-demo/api/books
	// send json via postman
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response addBook(Book book) {
		
		if (bookService.addBook(book)) {
			return Response.status(200).build();
		}
		return Response.status(500).build();
	}
	
	
}
