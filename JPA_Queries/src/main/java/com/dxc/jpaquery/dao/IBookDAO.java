package com.dxc.jpaquery.dao;

import java.util.List;

import com.dxc.jpaquery.utility.Book;

public interface IBookDAO {

    public abstract Book getBookById(int bookID);

    public abstract List<Book> getBookByTitle(String bookTitle);

    public abstract Long getBookCount();

    public abstract List<Book> getAuthorBooks(String author);

    public abstract List<Book> getAllBooks();

    public abstract List<Book> getBooksInPriceRange(double low, double high);
    
}
