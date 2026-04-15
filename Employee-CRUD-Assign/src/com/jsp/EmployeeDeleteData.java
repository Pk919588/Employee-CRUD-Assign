package com.jsp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeDeleteData {

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
 //           "Delete from employee where id=17;";
            "Delete from employee where id=14;";
			
			//5.Execute Query
            statement.execute(query);
			
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
