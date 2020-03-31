package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.BookDAO;
import domain.Book;
import dao.BookDAO;

@Service
public class BookServiceImpl implements BookService {

	@Autowired 
	public BookDAO bookdao;
	
	@Override
	public void create(Book b) {
		 bookdao.save(b);
	}

	@Override
	public void update(Book b) {
		bookdao.update(b);
	}

	@Override
	public void delete(String bid) {
		bookdao.delete(bid);
	}

	@Override
	public Book findById(String bid) {
		return bookdao.findById(bid);
	}

	@Override
	public List<Book> findAll() {
		return bookdao.findAll();
	}

	@Override
	public List<Book> findByProperty(String propName, Object propValue) {
		return bookdao.findByProperty(propName, propValue);
	}

}