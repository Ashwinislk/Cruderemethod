package com.example.CrudeRepoMethods.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.example.CrudeRepoMethods.model.User;

public interface UserServiceI {
	
	public User saveUserService(User user);
	
	public List<User> saveAllUser(List<User> user);
	
	public User getUser(int userId);
	
	public List<User> getAllUser();
	
	public List<User> getMultipleUser(List<Integer> ids);
	
	public boolean recordExitsOrNot(int userId);
	
	public long CountNoOfRecords();
	
	public boolean deleteRecordById(int userId);
	
	public boolean deleteAllById(List<Integer> ids);
	
	public boolean deleterecordByObject(User user);
	
	public boolean deleteAllRecords();
	
   public Page<User> userPagination();
	
	public List<User> sortingUser();

}
