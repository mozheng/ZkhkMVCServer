package cn.zkserver.dao;

import cn.zkserver.domain.Device;


public interface  DeviceDao {
	public abstract void add(Device device);

	public abstract Device find(String mcode);

	//查找注册的用户是否在数据库中存在
	//public abstract User find(String username);
}
