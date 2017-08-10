package com.zhangyi.service;

import java.util.List;

import com.zhangyi.bean.Info;

public interface DbService {
	
	public int insert(Info info);
	
	public int delete(int id);
	
	public int update(Info info);
	
	public List<Info> queryInfos();
	
	public Info queryInfo(int id);
	
}
