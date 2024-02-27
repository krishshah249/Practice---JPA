package com.cg.service;

import com.cg.entities.Author;

public interface AuthorService {
	
	public void addAuthor(Author a);
	public void removeAuthor(int a);
	public void updateAuthor(Author a);
	public Author findAuthor(int aid);
	
}
