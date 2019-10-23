package com.capgemini.librarymanagementsystem.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.librarymanagementsystem.beans.Users;

public class AdminDaoImpl implements AdminDAO{

	private static EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("TestPersistence");
	@Override
	public boolean addLibrarian(Users users) {
		try {
			EntityManager entityManager=entityManagerFactory.createEntityManager();
			EntityTransaction entityTransaction=entityManager.getTransaction();
			entityTransaction.begin();
			entityManager.persist(users);
			entityTransaction.commit();
			entityManager.close();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public Boolean deleteLibrarian(Integer userId) {
		try {
			EntityManager entityManager=entityManagerFactory.createEntityManager();
			EntityTransaction entityTransaction=entityManager.getTransaction();
			Users customer=entityManager.find(Users.class, userId);		
			if(customer.getType().equalsIgnoreCase("librarian")) {
				entityTransaction.begin();
				entityManager.remove(customer);
				entityTransaction.commit();
				entityManager.close();
				return true;
			}		
		} catch (Exception e) {
			return false;
		}
		return false;
	}

	@Override
	public Users admissionDetails(Users users) {
		// TODO Auto-generated method stub
		return null;
	}

}
