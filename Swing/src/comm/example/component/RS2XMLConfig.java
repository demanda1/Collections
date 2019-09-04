package comm.example.component;

import comm.example.factory.*;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import comm.example.dao.*;
public class RS2XMLConfig {
	private MyConnectionFactory factory;
	private Connection conn;
	public RS2XMLConfig() throws SQLException{
		factory=MyConnectionFactory.createObject();
		conn=factory.getConnection();
	}
	
	
	public ResultSet getAllEmployees() throws SQLException{
		Statement st=conn.createStatement();
		ResultSet rs=st.executeQuery("select * from employee");
		return rs;
	}
}
