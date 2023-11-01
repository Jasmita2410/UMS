package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@SpringBootApplication
public class UniversityManagementSystem {

	public static void main(String[] args) {
		SpringApplication.run(UniversityManagementSystem.class, args);

				System.out.println("Hello world!");

				String url = "jdbc:mysql://localhost:3306/universitymanagementsystem";
				String user = "root";
				String password = "Mysql@root";

		try {
			// Load the MySQL driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection(url, user, password);
			System.out.println("Connection is successful to the database " + url);

			// Perform database operations here

			// Close the connection when done
			connection.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException throwables) {
			throwables.printStackTrace();
		}
		}

	}


