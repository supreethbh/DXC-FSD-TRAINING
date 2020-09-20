package com.dxc.jpaquery.utility;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "Books")
@NamedQueries(@NamedQuery(name = "getAllBooks", query = "SELECT book FROM Book book"))
public class Book implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @Column(name = "Book_ID")
    private Integer bookID;
    
    @Column(name = "Book_Title")
    private String bookTitle;
    
    @Column(name = "Author")
    private String author;
    
    @Column(name = "Book_Price")
    private Double bookPrice;
    
    public Integer getBookID() {
        return bookID;
    }
    
    public void setBookID(Integer bookID) {
        this.bookID = bookID;
    }
    
    public String getBookTitle() {
        return bookTitle;
    }
    
    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }
    
    public String getAuthor() {
        return author;
    }
    
    public void setAuthor(String author) {
        this.author = author;
    }
    
    public Double getBookPrice() {
        return bookPrice;
    }
    
    public void setBookPrice(Double bookPrice) {
        this.bookPrice = bookPrice;
    }

    @Override
    public String toString() {
	return "Book [book_ID : " + bookID + ", Book_Title : " + bookTitle + ", Author : " 
                     + author + ", Book_Price : " + bookPrice + "]";
    }
}
