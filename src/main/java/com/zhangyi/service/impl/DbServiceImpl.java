package com.zhangyi.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhangyi.bean.Info;
import com.zhangyi.mapper.InfoMapper;
import com.zhangyi.service.DbService;
@Service
public class DbServiceImpl implements DbService {

	@Autowired
	private InfoMapper im;

	public int insert(Info info) {
				
		return im.insertInfo(info);
	}

	public int delete(int id) {
		
		int i = im.deleteInfo(id);
		return i;
	}

	public int update(Info info) {
		
		int i = im.updateInfo(info);
		return i;
	}

	public Info queryInfo(int id){
		
		Info info = im.queryInfo(id);
		return info;
	}
	
	public List<Info> queryInfos() {
		
		List<Info> list = im.queryInfos();
		return list;
	}

}
