package com.yeah.dto;

public class UserVo {
	public Long id;
	public String name;
	public String sex;
	public int age;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String toString() {
		return "UserVo: id = " + this.getId() + ", name = " + this.getName() + ", sex = " + this.getSex() + ", age = " + this.getAge();
	}
}
