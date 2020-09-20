package com.dxc.jpaquery.service;

import java.util.List;

import com.dxc.jpaquery.dao.BookDAOImpl;
import com.dxc.jpaquery.dao.IBookDAO;
import com.dxc.jpaquery.utility.Book;

public class BookServiceImpl implements IBookService {

    private IBookDAO dao;

    public BookServiceImpl() {	
	dao = new BookDAOImpl();
    }
    
    @Override
    public Book getBookById(int bookID) {	
	return dao.getBookById(bookID);
    }

    @Override
    public List<Book> getBookByTitle(String bookTitle) {
	return dao.getBookByTitle(bookTitle);
    }

    @Override
    public Long getBookCount() {
	return dao.getBookCount();
    }

    @Override
    public List<Book> getAuthorBooks(String author) {
	return dao.getAuthorBooks(author);
    }

    @Override
    public List<Book> getAllBooks() {
	return dao.getAllBooks();
    }

    @Override
    public List<Book> getBooksInPriceRange(double low, double high) {
	return dao.getBooksInPriceRange(low, high);
    }  
}
