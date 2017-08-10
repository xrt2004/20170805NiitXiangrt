package com.zhangyi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zhangyi.bean.Info;
import com.zhangyi.service.DbService;
@Controller
@RequestMapping("/hello")
public class HelloController {
	@Autowired
	private DbService dbService;

	@RequestMapping("/mvc")
	public String hello(ModelMap model){
		
		Info info = dbService.queryInfo(3);
		model.addAttribute("info", info);
		return "hello";
	}
	@RequestMapping("/form")
	public String showForm(@RequestParam("name")String username,ModelMap model){
		model.addAttribute("username",username);
		return "showForm";
	}
}
