package com.jsp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeInsertData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//1.Load Driver
			Class.forName("org.postgresql.Driver");
			
			//2.Create connection
			String url = "jdbc:postgresql://localhost:5432/m3jdbc";
            String username = "postgres";
            String password = "root";
            
            Connection connection = DriverManager.getConnection(url, username, password);
			
			//3.Create Statement
            Statement statement=connection.createStatement();
			
			//4.SQL Query
            String query=
//            "insert into employee values(11, 'Himanshu', 'Male', 'CSE');";
//            "insert into employee values(12, 'Hema', 'Female', 'BioTech');";
//             "insert into employee values(13, 'Pragati', 'Female', 'Agriculture');";
//            "insert into employee values(14, 'Sohal', 'Male', 'AI');";
//            "insert into employee values(15, 'Sonali', 'Female', 'IT');";
//            "insert into employee values(16, 'Himashi', 'Female', 'CIVIL');";
//            "insert into employee values(17, 'Riya', 'Female', 'Commerce');";
            "insert into employee values(18, 'Hema', 'Female', 'Aeronatical');";
            
			
			//5.Execute Query
            statement.execute(query);
			
			//6.Connection Close
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
