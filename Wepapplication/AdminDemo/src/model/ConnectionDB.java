package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDB {
	
	
	public static Connection getConnection() {
		Connection connection = null;
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			connection = DriverManager.getConnection("jdbc:sqlserver://t031097.database.windows.net:1433;database=vanthinh15130177;user=t031097@t031097;password=Abcdabcd1;encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30;");
		}catch(ClassNotFoundException | SQLException ex) {
			return null;
		}
		return connection;
		
	}
	public static void main(String[] args) {
		System.out.println(getConnection());
	}
}
