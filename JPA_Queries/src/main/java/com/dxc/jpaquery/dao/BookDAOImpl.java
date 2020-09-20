package com.dxc.jpaquery.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.dxc.jpaquery.connection.JPAConnection;
import com.dxc.jpaquery.utility.Book;

public class BookDAOImpl implements IBookDAO {

    private EntityManager entityManager;

    public BookDAOImpl() {	
	entityManager = JPAConnection.getEntityManager();
    }
    
    @Override
    public Book getBookById(int bookID) {
	
	return entityManager.find(Book.class, bookID);
    }

    @Override
    public List<Book> getBookByTitle(String bookTitle) {
	
	String selectQuery = " SELECT book FROM Book book WHERE book.bookTitle LIKE : ptitle ";
	
	TypedQuery<Book> query = entityManager.createQuery(selectQuery, Book.class);
	
	query.setParameter("ptitle", "%" + bookTitle + "%");
	
	return query.getResultList();
    }

    @Override
    public Long getBookCount() {
	
	String selectQuery = " SELECT COUNT(book.bookID) FROM Book book ";
	
	TypedQuery<Long> query = entityManager.createQuery(selectQuery, Long.class);
	
	return query.getSingleResult();
    }

    @Override
    public List<Book> getAuthorBooks(String author) {
	
	String selectQuery = " SELECT book FROM Book book WHERE book.author = : pAuthor ";
	
	TypedQuery<Book> query = entityManager.createQuery(selectQuery, Book.class);
	
	query.setParameter("pAuthor", author);
	
	return query.getResultList();
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Book> getAllBooks() {
	
	Query query = entityManager.createNamedQuery("getAllBooks");
	
	return query.getResultList();
    }

    @Override
    public List<Book> getBooksInPriceRange(double low, double high) {
	
	String selectQuery = " SELECT book FROM Book book WHERE book.bookPrice between :low and :high ";
	
	TypedQuery<Book> query = entityManager.createQuery(selectQuery, Book.class);
	
	query.setParameter("low", low);
	
	query.setParameter("high", high);
	
	return query.getResultList();
    }
}
