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
	//�û�������Ϊ��
	//���벻��Ϊ��
	///�������䣨��棬����Ϊ�գ��Ҹ�ʽ�Ϸ���
	///���տ���Ϊ�գ�������ʱ����Ҫ���ڡ�
	//�ǳƲ���Ϊ�գ���Ϊ���֣�
	public boolean validate()
	{
		boolean isOK = true;
		
		if(this.username == null || this.username.trim().equals(""))
		{
			isOK = false ; 
			error.put("username", "�û�������Ϊ�գ���");
		}
		else
		{
			if(!this.username.matches("(3,8)"))
			{
				isOK = false;
				error.put("username", "�û�����Ҫ3-8λ����");
			}
		}
		
		if(this.password == null || this.password.trim().equals(""))
		{
			isOK = false ; 
			error.put("username", "���벻��Ϊ�գ���");
		}
		else
		{
			if(!this.username.matches("(3,8)"))
			{
				isOK = false;
				error.put("username", "�û�����Ҫ3-8λ����");
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
