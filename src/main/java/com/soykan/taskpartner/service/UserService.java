package com.soykan.taskpartner.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.soykan.taskpartner.entity.User;
import com.soykan.taskpartner.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public User createUser(User user) {
		String encodedPassword = encodePassword(user.getPassword());
		user.setPassword(encodedPassword);
		return userRepository.save(user);
	}
	
	private String encodePassword(String password) {
		BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
		return bCryptPasswordEncoder.encode(password);
	}
}
