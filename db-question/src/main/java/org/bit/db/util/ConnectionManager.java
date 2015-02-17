package org.bit.db.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionManager {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testmaster", "root", "root");
		System.out.println("Connection :"+con);
		System.out.println("Connection :"+con.getMetaData().getDatabaseProductName());
	}
}
