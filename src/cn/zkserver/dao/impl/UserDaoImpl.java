package cn.zkserver.dao.impl;

import java.io.IOException;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;

import cn.zkserver.dao.UserDao;
import cn.zkserver.domain.User;
import cn.zkserver.utils.XmlUtils;

public class UserDaoImpl implements UserDao {
	/* (non-Javadoc)
	 * @see cn.zkserver.dao.impl.UserDao#add(cn.zkserver.domain.User)
	 */
	@Override
	public void add(User user)
	{
		try 
		{
		
			Document document = XmlUtils.getDocument();
			Element user_tag = document.getRootElement().addElement("user");
			user_tag.setAttributeValue("id", String.valueOf ( user.getId() ));
			user_tag.setAttributeValue("username", user.getUsername());
			user_tag.setAttributeValue("password", user.getPassword());
			XmlUtils.writetoXml(document);
		} catch (DocumentException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
	/* (non-Javadoc)
	 * @see cn.zkserver.dao.impl.UserDao#find(java.lang.String, java.lang.String)
	 */
	@Override
	public User find(String username,String password)
	{
		
		try
		{
			Document document = XmlUtils.getDocument();
			String xpathString ="//user[ @username= \"" +username+  "\"and @password= \"" + password +"\"]" ;
			Element e = (Element) document.selectSingleNode( xpathString );
			if (e==null)
			{
				return null;
			}
			User user = new User();
			int id = Integer.valueOf(  e.attributeValue("id") );
			user.setId( id);
			user.setUsername(e.attributeValue("username"));
			user.setPassword(e.attributeValue("password"));
			return user;
			
		} catch (DocumentException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
	//查找注册的用户是否在数据库中存在
	/* (non-Javadoc)
	 * @see cn.zkserver.dao.impl.UserDao#find(java.lang.String)
	 */
	@Override
	public User find(String username)
	{
		
		return null;
	}
	
}
