package com.capgemini.librarymanagementsystem.dao;

import com.capgemini.librarymanagementsystem.beans.BooksRegistration;
import com.capgemini.librarymanagementsystem.beans.BooksTransaction;
import com.capgemini.librarymanagementsystem.beans.Users;

public interface StudentDAO {
	public BooksRegistration requestBook(BooksRegistration registration);
	public Users updateProfile(Users users);
	public BooksTransaction returnBook(BooksTransaction booksTransaction);
	
}
