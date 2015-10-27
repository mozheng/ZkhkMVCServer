package cn.zkserver.web.formbean;

import java.util.HashMap;
import java.util.Map;



public class RegisterForm {
	private String username;
	private String id;
	private String password;
	
	private Map error = new HashMap();
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	//用户名不能为空
	//密码不能为空
	///电子邮箱（广告，不能为空，且格式合法）
	///生日可以为空，但不空时必须要日期。
	//昵称不能为空（且为汉字）
	public boolean validate()
	{
		boolean isOK = true;
		
		if(this.username == null || this.username.trim().equals(""))
		{
			isOK = false ; 
			error.put("username", "用户名不能为空！！");
		}
		else
		{
			if(!this.username.matches("(3,8)"))
			{
				isOK = false;
				error.put("username", "用户名需要3-8位！！");
			}
		}
		
		if(this.password == null || this.password.trim().equals(""))
		{
			isOK = false ; 
			error.put("username", "密码不能为空！！");
		}
		else
		{
			if(!this.username.matches("(3,8)"))
			{
				isOK = false;
				error.put("username", "用户名需要3-8位！！");
			}
		}
		
		return isOK;
	}
	public Map getError() {
		return error;
	}
	public void setError(Map error) {
		this.error = error;
	}

}
