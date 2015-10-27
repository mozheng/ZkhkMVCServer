package cn.zkserver.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import sun.misc.BASE64Encoder;

import com.sun.corba.se.impl.protocol.giopmsgheaders.Message;

public class ServiceUtils 
{

	public static String md5(String message)
	{
		try {
			MessageDigest md = MessageDigest.getInstance("md5");
			byte md5[] = md.digest( message.getBytes() );
			BASE64Encoder encoder = new BASE64Encoder();
			return encoder.encode(md5);
			
		} catch (NoSuchAlgorithmException e) {
			// TODO: handle exception
		}
		return null;
	}
	
}
