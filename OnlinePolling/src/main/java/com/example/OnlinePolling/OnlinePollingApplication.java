package com.example.OnlinePolling;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OnlinePollingApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlinePollingApplication.class, args);
		System.out.println("Hello World");
		connect();
	}
	public static void connect()
	{
		String url="jdbc:mysql://localhost:3306/polling";
		String user = "root";
		String pwd = "Mathan@123";
		try(Connection conn=DriverManager.getConnection(url, user, pwd))
		{
			if(conn!=null)
			{
			   System.out.print("Connection Successfully");
			}
		}
		catch(SQLException e)
		{
			System.out.print("Connection Unsuccessfull"+e.getMessage());
			
		}
	}

}
