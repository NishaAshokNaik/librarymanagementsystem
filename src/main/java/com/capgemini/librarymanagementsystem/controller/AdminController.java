package com.capgemini.librarymanagementsystem.controller;

import org.springframework.web.bind.annotation.RestController;

import com.capgemini.librarymanagementsystem.service.AdminService;
import com.capgemini.librarymanagementsystem.service.AdminServiceImpl;

@RestController
public class AdminController {
	AdminService adminService = new AdminServiceImpl();
	
	
	
}
