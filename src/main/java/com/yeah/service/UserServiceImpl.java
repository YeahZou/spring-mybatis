package com.yeah.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yeah.dao.UserMapper;
import com.yeah.dto.UserVo;

@Service
@Transactional
public class UserServiceImpl implements UserService{

	@Autowired
	private UserMapper userMapper;
	
	@Override
	public UserVo getUserById(Long id) {
		return userMapper.getUserById(id);
	}

}
