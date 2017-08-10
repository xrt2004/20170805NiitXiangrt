package com.zhangyi.service;

import java.util.List;

import com.zhangyi.bean.Info;
import com.zhangyi.bean.Users;

public interface UsersService {
	
	public boolean login(Users user);
	
	public int insert(Users user);
	
	public int delete(int id);
	
	public int update(Users user);
	
	public List<Users> queryUsers();
	
	public Users queryUser(int id);

}
