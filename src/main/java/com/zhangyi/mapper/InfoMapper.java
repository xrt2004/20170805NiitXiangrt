package com.zhangyi.mapper;

import java.util.List;

import com.zhangyi.bean.Info;

public interface InfoMapper {
	
	public List<Info> queryInfos();
	
	public Info queryInfo(int id);
	
	public int insertInfo(Info info);
	
	public int updateInfo(Info info);
	
	public int deleteInfo(int id);

}
