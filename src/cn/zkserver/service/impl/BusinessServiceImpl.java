package cn.zkserver.service.impl;

import cn.zkserver.dao.UserDao;
import cn.zkserver.dao.impl.UserDaoImpl;
import cn.zkserver.domain.User;
import cn.zkserver.exception.UserExistException;
import cn.zkserver.utils.ServiceUtils;

public class BusinessServiceImpl {

	private UserDao dao = new UserDaoImpl();
	public void register(User user) throws UserExistException
	{
		//Is user exist?
		if (dao.find(user.getUsername()) == null)
		{
			throw new UserExistException();//发现注册用户已存在，提醒web层处理
		}
		else 
		{
			user.setPassword(ServiceUtils.md5(user.getPassword()));
			dao.add(user);
		} 
		
	}
	
	
	public User login(String username,String password) 
	{
		password= ServiceUtils.md5(password);	
		return dao.find(username, password );
	}
	
	
	
	
}
