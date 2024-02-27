package com.cg.service;

import com.cg.dao.AuthorDAOImpl;
import com.cg.entities.Author;

public class AuthorServiceImpl implements AuthorService {

	AuthorDAOImpl dao = new AuthorDAOImpl();
	
	
	@Override
	public void addAuthor(Author a) {
		// TODO Auto-generated method stub
		dao.addAuthor(a);

	}

	@Override
	public void removeAuthor(int aid) {
		// TODO Auto-generated method stub
		
		dao.removeAuthor(dao.findAuthor(aid));

	}

	@Override
	public void updateAuthor(Author a) {
		// TODO Auto-generated method stub
		dao.updateAuthor(a);

	}

	@Override
	public Author findAuthor(int aid) {
		// TODO Auto-generated method stub
		return dao.findAuthor(aid);
	}

}
