package com.zhangyi.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhangyi.bean.Info;
import com.zhangyi.bean.Users;
import com.zhangyi.mapper.UsersMapper;
import com.zhangyi.service.UsersService;

@Service
public class UsersServiceImpl implements UsersService{

	@Autowired
	private UsersMapper usersMapper;
	public boolean login(Users user) {
		
		boolean b = false;
		Users users = usersMapper.login(user);
		if(users!=null){
			b = true;
		}
		return b;
	}
	public int insert(Users user) {
		// TODO Auto-generated method stub
		return usersMapper.insertUser(user);
	}
	public int delete(int id) {
		// TODO Auto-generated method stub
		return usersMapper.deleteUser(id);
	}
	public int update(Users user) {
		// TODO Auto-generated method stub
		return usersMapper.updateUser(user);
	}
	public List<Users> queryUsers() {
		List<Users> list = usersMapper.queryUsers(); 
		return list;
	}
	public Users queryUser(int id) {
		Users user = usersMapper.queryUser(id);
		return user;
	}

}
