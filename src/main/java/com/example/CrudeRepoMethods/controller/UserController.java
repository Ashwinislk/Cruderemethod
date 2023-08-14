package com.example.CrudeRepoMethods.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;

import com.example.CrudeRepoMethods.model.User;
import com.example.CrudeRepoMethods.service.UserServiceI;

@Controller
public class UserController {
	@Autowired
	private UserServiceI userServiceI;
	

	public User saveUser(User user) {
		User user1 = userServiceI.saveUserService(user);
		
		return user1;
		
	}
	public List<User> saveAllUser(List<User> users){
		List<User> saveAllUser = userServiceI.saveAllUser(users);
		
		
		return saveAllUser;
		
	}
	
	public User getUserId(int userId) {
		User user = userServiceI.getUser(userId);
		
		
		return user;
		
	}
		
	public List<User> getAllUser(){
		
		List<User> allUser = userServiceI.getAllUser();
		return allUser;
		
	}
	
	public List<User> getMultipleUser(List<Integer> ids){
		List<User> multipleUser = userServiceI.getMultipleUser(ids);
		
		return multipleUser;
		
	}
	public boolean recordExitsOrNot(int userId) {
	        boolean recordExitsOrNot = userServiceI.recordExitsOrNot(userId);
		
		return recordExitsOrNot;
		
	}
	public long CountnoOfRecords() {
		      long count = userServiceI.CountNoOfRecords();
		
		return count;
		
	}
	public boolean deleterecordById(int userId) {
		    boolean deleteRecordById = userServiceI.deleteRecordById(userId);
		
		return deleteRecordById;
		
	}
	
	public boolean deleteAllByMultipleId(List<Integer> ids) {
	  boolean deleteAllById = userServiceI.deleteAllById(ids);
		    
		return deleteAllById;
		
		}
	public boolean deleterecordByObject(User user) {
		boolean deleterecordByObject = userServiceI.deleterecordByObject(user);
		
		return deleterecordByObject;
		
	}
	
	public boolean deleteAllrecords() {
		boolean deleteAllRecords = userServiceI.deleteAllRecords();
		
		return  deleteAllRecords;
		
	}
	public Page<User> userPagination(){
		Page<User> userPagination = userServiceI.userPagination();
		
		return userPagination;
		
	}
	public List<User> sortingUser(){
		List<User> sortingUser = userServiceI.sortingUser();
		
		return sortingUser;
		
	}

}
