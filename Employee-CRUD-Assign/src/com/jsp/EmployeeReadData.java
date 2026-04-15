package com.jsp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeReadData {

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
            "Select * from employee;";
			
			//5.Execute Query
            ResultSet rs = statement.executeQuery(query);
            System.out.println("Query executed");
            
            //6.Process a result
            while (rs.next()) {
                int id = rs.getInt("id");          // column name
                String name = rs.getString("name");
                String gender = rs.getString("gender");
                String dept = rs.getString("dept");
                
                System.out.println("ID: " + id + ", Name: " + name+" "+",gender: " +" " +gender +", dept: "+ dept);
            }
			
			//7.Close Connection
            statement.close();
            connection.close();
			
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
			
		}catch(SQLException e) {
			e.printStackTrace();
			
		}

	}

}
