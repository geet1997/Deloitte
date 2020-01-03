package com.cms.deloitte.dbcon;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBConnection {
	public static Connection makeConnection() {
		Connection connection = null;
		
		//1.load appropriate driver
		
				FileReader reader;
				try {
					reader = new FileReader("c:\\deloitte\\myDb.properties");
					Properties properties = new Properties();
					try {
						properties.load(reader);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					String driver  = properties.getProperty("driver");
					String url  = properties.getProperty("url");
					String username  = properties.getProperty("username");
					String password  = properties.getProperty("password");
					
					try {
						Class.forName(driver);
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
						try {
							connection = DriverManager.getConnection(url,username,password);
						} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
				} catch (FileNotFoundException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}	
			System.out.println("Driver Loaded!");
			
			//2. Obtain the database connection
					System.out.println("Connected");
					return connection;			
					}
}
