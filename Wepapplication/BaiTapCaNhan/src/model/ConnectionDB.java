package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDB {

	public static Connection getConnection() {
		Connection connection = null;
		try {

			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			connection = DriverManager.getConnection(
					"jdbc:sqlserver://t01.database.windows.net:1433;database=thinh031097;user=thinh0000@t01;password=Abcdabcd1;encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30;");
		} catch (ClassNotFoundException | SQLException ex) {
			System.out.println(ex.getMessage());
			return null;
		}
		return connection;
	}

	public static void main(String[] args) {
		System.out.println(getConnection());
	}
}
