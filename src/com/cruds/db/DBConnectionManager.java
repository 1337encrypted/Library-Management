package com.cruds.db;

import com.cruds.gui.MainFrame;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnectionManager {
	
	static
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	
	
	public static Connection getConnection() {
		
		Connection conn = null;
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookdb","root","root");
                        
		} catch (SQLException e) {
                        System.out.println("--------------------------------Falied---------------------------------");
			e.printStackTrace();
                        //new MainFrame().setVisible(true);
		}
		return conn;
		
	}

}
