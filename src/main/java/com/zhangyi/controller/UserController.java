package com.zhangyi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zhangyi.bean.Users;
import com.zhangyi.service.UsersService;

@Controller
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UsersService usersService;
	
	@RequestMapping("/index")
	public String index(){	
		return "index";
	}
	
	@RequestMapping("/login")
	public String login(@RequestParam("username")String username,
			@RequestParam("password")String password,ModelMap model){
		
		String view_name= "error";
		Users user = new Users();
		user.setUsername(username);
		user.setPassword(password);
		boolean b = usersService.login(user);
		model.addAttribute("username", username);
		if(b){
			return "redirect:/users/main"; 
		}
		return view_name;
	}
	
	@RequestMapping("/insert")
	public String insert(@RequestParam("username")String username,
			@RequestParam("password")String password){
		
		Users user = new Users();
		user.setUsername(username);
		user.setPassword(password);
		usersService.insert(user);
		return "redirect:/users/main";
	}
	
	@RequestMapping("/delete")
	public String delete(@RequestParam("id")int id){
		
		usersService.delete(id);
		return "redirect:/users/main";
	}

	@RequestMapping("/update")
	public String update(@RequestParam("username")String username,
			@RequestParam("id")int id){
		
		Users user = usersService.queryUser(id);
		usersService.insert(user);
		return "redirect:/users/main";
	}
	
	@RequestMapping("/main")
	public String queryUsers(ModelMap modelMap){
		
		List<Users> list = usersService.queryUsers();
		modelMap.addAttribute("users", list);
		return "main";
	}
}
