package com.zhangyi.mapper;

import java.util.List;

import com.zhangyi.bean.Users;

public interface UsersMapper {

	public Users login(Users user);
	
	public List<Users> queryUsers();
	
	public Users queryUser(int id);
	
	public int insertUser(Users user);
	
	public int updateUser(Users user);
	
	public int deleteUser(int id);
}
