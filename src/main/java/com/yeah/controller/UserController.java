package com.yeah.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yeah.dto.UserVo;
import com.yeah.service.UserService;

import net.sf.json.JSONObject;

@Controller
@RequestMapping("/")
public class UserController {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private UserService userService;

	@RequestMapping(value = "/user", method = RequestMethod.GET)
	@ResponseBody
	public Object getUserById(UserVo userVo, HttpServletRequest request, HttpServletResponse response) throws IOException {
		UserVo userV = userService.getUserById(userVo.getId());
		
		//response.setContentType("application/json");
		//response.getWriter().print(JSONObject.fromObject(userV));
		return userV;
	}
	
	@RequestMapping("/user.do")
	public String user() {
		return "user";
	}
}