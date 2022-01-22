package com.example.Biblio.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Biblio.repository.UserRepository;
import com.example.Biblio.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserRepository UserRepository;

	public UserServiceImpl(com.example.Biblio.repository.UserRepository userRepository) {
		super();
		UserRepository = userRepository;
	}
}
