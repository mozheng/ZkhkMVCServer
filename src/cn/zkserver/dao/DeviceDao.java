package cn.zkserver.dao;

import cn.zkserver.domain.Device;


public interface  DeviceDao {
	public abstract void add(Device device);

	public abstract Device find(String mcode);

	//����ע����û��Ƿ������ݿ��д���
	//public abstract User find(String username);
}
