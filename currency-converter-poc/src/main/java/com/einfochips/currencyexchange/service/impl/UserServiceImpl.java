package com.einfochips.currencyexchange.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.einfochips.currencyexchange.domain.Users;
import com.einfochips.currencyexchange.repositories.UserRepository;
import com.einfochips.currencyexchange.services.UserService;

/**
 * @author akash.shinde
 *
 */
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public Users save(Users user) {
		return userRepository.save(user);
	}

	@Override
	public Iterable<Users> getAllUsers(Boolean isActive) {
		return null;
	}

	@Override
	public Users getUser(String id) {
		return userRepository.findByEmail(id);
	}

	@Override
	public Users editUser(Users userRecord) {
		return userRepository.save(userRecord);
	}

	@Override
	public void deleteUser(Users user) {
		userRepository.delete(user);
	}

	@Override
	public Users getUser(long id) {
		return userRepository.findOne(id);
	}

	@Override
	public Users findUserByEmailId(String email) {
		return userRepository.findByEmail(email);
	}

	@Override
	public Users getUserForCreatedby(long id) {
		return userRepository.findOne(id);
	}

	@Override
	public Iterable<Users> getAllActiveAndInactiveUsers() {
		return userRepository.findAll();
	}

}
