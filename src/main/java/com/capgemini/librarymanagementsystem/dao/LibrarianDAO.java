package com.capgemini.librarymanagementsystem.dao;

import com.capgemini.librarymanagementsystem.beans.BookInventory;
import com.capgemini.librarymanagementsystem.beans.BooksTransaction;
import com.capgemini.librarymanagementsystem.beans.Users;

public interface LibrarianDAO {
	public BookInventory addBooks(BookInventory inventory);
	public Integer deleteBook(Integer bookId);
	public Users updateProfile(Users users);
	public BookInventory updateBook(BookInventory inventory);
	public BooksTransaction issueBook(BooksTransaction transaction );
	public BookInventory updateReturnBook(BookInventory bookInventory);
}
