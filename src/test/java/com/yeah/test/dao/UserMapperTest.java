package com.yeah.test.dao;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.yeah.dao.UserMapper;
import com.yeah.dto.UserVo;
import com.yeah.test.base.BaseTest;

public class UserMapperTest extends BaseTest{
	@Autowired
	private UserMapper userMapper;
	
	@Test
	public void getUserById() {
		Long userId = 1L;
		
		UserVo userVo = userMapper.getUserById(userId);
		System.out.println(userVo.toString());
	}
}
