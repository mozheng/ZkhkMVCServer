package cn.zkserver.dao;

import cn.zkserver.domain.User;

public interface UserDao {

	public abstract void add(User user);

	public abstract User find(String username, String password);

	//����ע����û��Ƿ������ݿ��д���
	public abstract User find(String username);

}