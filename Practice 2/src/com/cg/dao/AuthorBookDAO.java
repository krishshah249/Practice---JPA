package com.cg.dao;

import java.util.List;

import com.cg.entities.Book;

public interface AuthorBookDAO {
	
	public List<Book> getAllBooks();
	
	public List<Book> getBooksByAuthor(String author_name);
	
	public List<Book> getBooksByPriceRange(double min,double max);
	
	public List<String> getAuthorName(long b_id);
}
