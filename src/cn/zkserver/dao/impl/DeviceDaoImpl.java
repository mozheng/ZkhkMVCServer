package cn.zkserver.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import cn.zkserver.dao.DeviceDao;
import cn.zkserver.domain.Device;
import cn.zkserver.utils.CurrentTime;

public class DeviceDaoImpl implements DeviceDao {

	@Override
	public void add(Device device) {
		// TODO Auto-generated method stub
		if(device!=null)
		try
		{
			String sql;
			System.out.println(12);
			Class.forName("org.sqlite.JDBC");
			Connection connection = DriverManager.getConnection("jdbc:sqlite://c:/jkserver.sqlite");
			Statement statement = connection.createStatement();
			sql = "insert into dev values('"+device.getMcode()+ "',"+device.getHp()+","+device.getSp()+","+ device.getPulse()+", '"+device.getSendtime()+ "' ,'"+CurrentTime.getDate()+"')";
			System.out.println(sql);
			statement.executeUpdate(sql);
			connection.close();
		} catch (Exception e)
		{
			e.printStackTrace();
		} 
	}

	@Override
	public Device find(String mcode) {
		// TODO Auto-generated method stub
		return null;
	}

}
