package com.jsp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		//1.Load Driver
			Class.forName("org.postgresql.Driver");
		
		//2.Create Connection
			String url = "jdbc:postgresql://localhost:5432/m3jdbc";
            String username = "postgres";
            String password = "root";
            
            Connection connection = DriverManager.getConnection(url, username, password);
            
		
		//3.Create Statement
            Statement statement=connection.createStatement();
		
		//4.SQL Query
            String query=
            "create table employee(id numeric primary key, name varchar(20), gender varchar(10), dept varchar(20));";
		
		//5.Execute Query
            statement.execute(query);
            System.out.println("Employee Table created successfully");
		
		//6.Close Connection
            statement.close();
            connection.close();
            System.out.println(connection);
            
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
			
		}catch(SQLException e) {
			e.printStackTrace();
		}

	}

}
