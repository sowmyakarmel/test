package com.niit.dao;

import com.niit.model.CreateUser;

public interface RegisterDao
{
	void addData(CreateUser createuser);
	void createuserUpdate();
	CreateUser getUser(int id);
	CreateUser getEmail(String email);
}
