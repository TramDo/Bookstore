package service;

import java.util.List;

import domain.Book;

public interface BookService {
	public void create(Book b);
	public void update(Book b);
	public void delete(String bid);
	public Book findById(String bid);
	public List<Book> findAll();
	public List<Book> findByProperty(String propName, Object propValue);
}