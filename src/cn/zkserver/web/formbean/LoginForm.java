package cn.zkserver.web.formbean;

import java.util.HashMap;
import java.util.Map;

import cn.zkserver.dao.impl.UserDaoImpl;
import cn.zkserver.domain.User;

public class LoginForm {

	private String username;
	private String password;
	private Map <String,String> itemMap;
	private User user;
	public LoginForm() {
		// TODO Auto-generated constructor stub
		itemMap = new HashMap<String, String>();
		user = new User();
	}
	
	public Boolean Login( String usernameString, String passwordString,Map <String,String> itemMap)
	{
		this.itemMap = itemMap;
		return Login(usernameString, passwordString);
	}
	public Boolean Login( String usernameString, String passwordString)
	{
		this.username = usernameString;
		this.password = passwordString;
		return isLogin();
	}	
	public Boolean isLogin() 
	{
		Boolean isOK = false;
		if(itemMap!=null && itemMap.get("name").toString().equals(getUsername()) && itemMap.get("password").toString().equals(getPassword()) )
			isOK =true;
		else
		{
			User user = new UserDaoImpl().find(getUsername(), getPassword()) ;
			if(user!=null)
			{
				if (itemMap==null) {
					itemMap = new HashMap<String, String>();
				}
				itemMap.put("name", user.getUsername());
				itemMap.put("password",user.getPassword());
				isOK = true;
				this.user = user;
			}
			
		}
		return isOK;
	}
	
	public User getUser() 
	{
		return user;
	}
	
	
	
	
	
	
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
	public Map <String,String> getItemMap() {
		return itemMap;
	}
	public void setItemMap(Map <String,String> itemMap) {
		this.itemMap = itemMap;
	}



	
	
	
	
}
