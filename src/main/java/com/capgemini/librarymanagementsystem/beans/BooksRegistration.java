package com.capgemini.librarymanagementsystem.beans;

import java.util.Date;

public class BooksRegistration {
	private String regId;
	private String bookId;
	private String userId;
	private Date regOnDate;
	public String getRegId() {
		return regId;
	}
	public void setRegId(String regId) {
		this.regId = regId;
	}
	public String getBookId() {
		return bookId;
	}
	public void setBookId(String bookId) {
		this.bookId = bookId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public Date getRegOnDate() {
		return regOnDate;
	}
	public void setRegOnDate(Date regOnDate) {
		this.regOnDate = regOnDate;
	}
	
	
}
