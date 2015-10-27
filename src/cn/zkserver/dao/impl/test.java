package cn.zkserver.dao.impl;

import cn.zkserver.domain.User;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserDaoImpl test = new UserDaoImpl();
		User u =new User();
		u = test.find("root","123456");
		System.out.println(u);
		
	}

}
