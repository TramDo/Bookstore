package dao;

import java.sql.SQLDataException;
import java.util.List;


import domain.Book;
/**
 * An interface to create, update, delete, read, from the Book Table
 * implemented in BookDAOImpl
 * @author Anil
 *
 */
public interface BookDAO {
	public void save(Book b);
	public void update(Book b);
	public void delete(String bid);
	public Book findById(String bid);
	public List<Book> findAll();
	public List<Book> findByProperty(String propName, Object propValue);
	public List<Book> searchByTitle(String title);
	public List<Book> searchByAuthor(String author);
	public List<Book> searchTopBooks();

}
