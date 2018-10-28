package com.yeah.service;

import org.springframework.transaction.annotation.Transactional;

import com.yeah.dto.UserVo;

@Transactional
public interface UserService {
	UserVo getUserById(Long id);
}
