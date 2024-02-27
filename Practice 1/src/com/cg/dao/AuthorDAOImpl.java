package com.cg.dao;

import javax.persistence.EntityManager;

import com.cg.DBUtil.db;
import com.cg.entities.Author;

public class AuthorDAOImpl implements AuthorDAO {

	db con;
	EntityManager em;
	public AuthorDAOImpl(){
		con=new db();
		em= con.getManager();
	}
	@Override
	public void addAuthor(Author a) {
		// TODO Auto-generated method stub
		em.getTransaction().begin();
		em.persist(a);
		em.flush();
		em.getTransaction().commit();
	}

	@Override
	public void removeAuthor(Author a) {
		// TODO Auto-generated method stub
		em.getTransaction().begin();
		em.remove(a);
		em.flush();
		em.getTransaction().commit();

	}

	@Override
	public void updateAuthor(Author a) {
		// TODO Auto-generated method stub
		em.getTransaction().begin();
		em.merge(a);
		em.flush();
		em.getTransaction().commit();

	}

	@Override
	public Author findAuthor(int aid) {
		// TODO Auto-generated method stub
		return em.find(Author.class, aid);
	}

}
