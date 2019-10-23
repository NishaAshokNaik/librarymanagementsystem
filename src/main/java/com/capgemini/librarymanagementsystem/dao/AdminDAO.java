package com.capgemini.librarymanagementsystem.dao;

import com.capgemini.librarymanagementsystem.beans.Users;

public interface AdminDAO {
	public boolean addLibrarian(Users users);
	public Boolean deleteLibrarian(Integer userId);
	public Users admissionDetails(Users users);
}
