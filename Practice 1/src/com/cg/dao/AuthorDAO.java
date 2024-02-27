package com.cg.dao;

import com.cg.entities.Author;

public interface AuthorDAO {
	
	public void addAuthor(Author a);
	public void removeAuthor(Author a);
	public void updateAuthor(Author a);
	public Author findAuthor(int aid);

}
