package com.example.CrudeRepoMethods;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Page;

import com.example.CrudeRepoMethods.controller.UserController;
import com.example.CrudeRepoMethods.model.User;

@SpringBootApplication
public class CrudeRepoMethodsApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(CrudeRepoMethodsApplication.class, args);
		UserController controller = context.getBean(UserController.class);

		/*
		  User user=new User(); user.setUserId(4); user.setUserName("pooja");
		  user.setUserAddress("nagpur"); user.setUserAge(25);
		  user.setUserEmail("pooja123@gmail.com"); user.setUserPass("96537");
		  
		  User saveUser = controller.saveUser(user); System.out.println(saveUser);
		 */

		/*
		  User user1=new User(); //user1.setUserId(8); user1.setUserName("akash");
		  user1.setUserAddress("nagpur"); user1.setUserAge(25);
		  user1.setUserEmail("pooja123@gmail.com"); user1.setUserPass("96537");
		  
		  
		  User user2=new User(); //user2.setUserId(9); user2.setUserName("shreya");
		  user2.setUserAddress("nagpur"); user2.setUserAge(25);
		  user2.setUserEmail("pooja123@gmail.com"); user2.setUserPass("96537");
		  
		  
		  User user3=new User(); // user3.setUserId(10); user3.setUserName("rahul");
		  user3.setUserAddress("nagpur"); user3.setUserAge(25);
		  user3.setUserEmail("pooja123@gmail.com"); user3.setUserPass("96537");
		  
		  
		  List al=new ArrayList<User>(); al.add(user1); al.add(user2); al.add(user3);
		  
		  
		  
		  List saveAllUser = controller.saveAllUser(al);
		  
		  System.out.println(saveAllUser);
		 */

		// User userId = controller.getUserId(1);
		// System.out.println(userId);

		// List<User> allUser = controller.getAllUser();
		// System.out.println(allUser);

		/*
		  List<Integer> ids=new ArrayList(); ids.add(4); ids.add(5); ids.add(6);
		  List<User> multipleUser = controller.getMultipleUser(ids);
		  System.out.println(multipleUser);
		 */

		// boolean recordExitsOrNot = controller.recordExitsOrNot(15);
		// System.out.println(recordExitsOrNot);

		// boolean deleterecordById = controller.deleterecordById(6);
		// System.out.println(deleterecordById);

		// long countnoOfRecords = controller.CountnoOfRecords();
		// System.out.println(countnoOfRecords);

		/*
		  List<Integer> ids=new ArrayList<>(); 
		  ids.add(11); 
		  ids.add(12); 
		  boolean deleteAllByMultipleId = controller.deleteAllByMultipleId(ids);
		  System.out.println(deleteAllByMultipleId);
		 */ 
		 
		/*
		  User user=new User(); user.setUserId(10);
		  
		  boolean deleterecordByObject = controller.deleterecordByObject(user);
		  System.out.println(deleterecordByObject);
		  
		 */

		// boolean deleteAllrecords = controller.deleteAllrecords();
		// System.out.println(deleteAllrecords);

		/*
		 Page<User> userPagination = controller.userPagination();
		  System.out.println(userPagination); for (User u : userPagination) {
		  System.out.println(u); }
		 */

		List<User> sortingUser = controller.sortingUser();
		System.out.println(sortingUser);

		for (User s : sortingUser) {
			System.out.println(s);
		}
	}

}
