package de.gre90r.jaxrsdemo.dto;

import java.util.Objects;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Book implements Comparable<Book> {
	
	private final int id;
	private final String name;
	private final String author;
	private final String publisher;
	
	public Book() {
		this.id = 0;
		this.name = "";
		this.author = "";
		this.publisher = "";
	}

	public Book(int id, String name, String author, String publisher) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
	}

	public Book(Book book) {
		super();
		this.id = book.getId();
		this.name = book.getName();
		this.author = book.getAuthor();
		this.publisher = book.getPublisher();
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getPublisher() {
		return publisher;
	}
	
	public String getAuthor() {
		return author;
	}

	@Override
	public int hashCode() {
		return Objects.hash(author, id, name, publisher);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return id == other.id;
	}

	@Override
	public int compareTo(Book other) {
		return this.getId() - other.getId();
	}
	
}
