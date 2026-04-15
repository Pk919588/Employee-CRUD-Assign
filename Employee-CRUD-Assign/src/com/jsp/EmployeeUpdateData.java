package com.jsp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeUpdateData {

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
//            "update employee set name='Sunny' where id=18;";
            "update employee set name='Simran' where id=17";
            
			
			//5.Execute Query
            int i=statement.executeUpdate(query);
            System.out.println(i);
			
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
