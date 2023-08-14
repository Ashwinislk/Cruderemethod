package com.example.CrudeRepoMethods.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.CrudeRepoMethods.model.User;
import com.example.CrudeRepoMethods.repository.UserRepository;

@Service
public class UserServiceImpl implements UserServiceI {
	@Autowired
	private UserRepository userRepository;

	public User saveUserService(User user) {
		User user1 = userRepository.save(user);
		return user1;
	}

	public List<User> saveAllUser(List<User> user) {
		List<User> saveAll = (List<User>) userRepository.saveAll(user);
		return saveAll;
	}

	@Override
	public User getUser(int userId) {
		User findById = userRepository.findById(userId).get();
		return findById;
	}

	@Override
	public List<User> getAllUser() {
		List<User> findAll = (List<User>) userRepository.findAll();
		return findAll;
	}

	@Override
	public List<User> getMultipleUser(List<Integer> ids) {
		List<User> findAllById = (List<User>) userRepository.findAllById(ids);
		return findAllById;
	}

	@Override
	public boolean recordExitsOrNot(int userId) {
		boolean existsById = userRepository.existsById(userId);
		return existsById;
	}

	@Override
	public long CountNoOfRecords() {
		long count = userRepository.count();
		return count;
	}

	@Override
	public boolean deleteRecordById(int userId) {
		boolean existsById = userRepository.existsById(userId);

		if (existsById) {
			userRepository.deleteById(userId);
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean deleteAllById(List<Integer> ids) {
		List<User> findAllById = userRepository.findAllById(ids);
		if (findAllById.isEmpty()) {
			return false;
		} else {
			userRepository.deleteAllById(ids);
			return true;
		}
	}

	@Override
	public boolean deleterecordByObject(User user) {
		boolean existsById = userRepository.existsById(user.getUserId());
		if (existsById) {

			userRepository.delete(user);
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean deleteAllRecords() {

		List<User> findAll = userRepository.findAll();
		if (findAll.isEmpty()) {
			return false;
		} else {
			userRepository.deleteAll();
			return true;
		}
	}

	@Override
	public Page<User> userPagination() {
		PageRequest of = PageRequest.of(2, 4);
		
		Page<User> page = userRepository.findAll(of);
		return page;
	}

	@Override
	public List<User> sortingUser() {
		List<User> findAll = userRepository.findAll(Sort.by("UserId").ascending());
		return findAll;
	}

	

}
