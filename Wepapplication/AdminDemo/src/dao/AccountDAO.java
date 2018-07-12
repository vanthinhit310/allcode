package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

import model.Account;
import model.ConnectionDB;

public class AccountDAO {
	public static List<Account> getAll(){
		List<Account> accounts = new LinkedList<>();
		Connection connection = ConnectionDB.getConnection();
		try {
			Statement statement = connection.createStatement();
			ResultSet re = statement.executeQuery("select * from ACCOUNT");
			while(re.next()) {
				accounts.add(new Account(re.getString(1), re.getString(2), re.getString("ten"), re.getString(4), re.getString(5), re.getString(6)));
			}
		}catch(SQLException e) {
			return null;
		}
		return accounts;
	}
	
	public static Account getAccount(String username){
		Account accounts = null;
		Connection connection = ConnectionDB.getConnection();
		try {
			Statement statement = connection.createStatement();
			ResultSet re = statement.executeQuery("select * from ACCOUNT where username = '"+username+"'");
			while(re.next()) {
				accounts = new Account(re.getString(1), re.getString(2), re.getString("ten"), re.getString(4), re.getString(5), re.getString(6));
			}
		}catch(SQLException e) {
			return null;
		}
		return accounts;
	}
	
	public static boolean add(Account account) {
		Connection connection = ConnectionDB.getConnection();
		try {
			PreparedStatement statement = connection.prepareStatement("insert into account values(?,?,?,?,?,?)");
			statement.setString(1, account.getUsername());
			statement.setString(2, account.getPassword());
			statement.setString(3, account.getTen());
			statement.setString(4, account.getEmail());
			statement.setString(5, account.getSdt());
			statement.setString(6, account.getPhanQuyen());
			statement.executeUpdate();
		}catch(SQLException e) {
			return false;
		}
		return true;
	}
	
	public static boolean update(Account account) {
		Connection connection = ConnectionDB.getConnection();
		try {
			PreparedStatement statement = connection.prepareStatement("update account set ten=?,sodienthoai=? where username = ?");
			statement.setString(1, account.getTen());
			statement.setString(2, account.getSdt());
			statement.setString(3, account.getUsername());
			statement.executeUpdate();
		}catch(SQLException e) {
			System.out.println(e.getMessage());
			return false;
		}
		return true;
	}
	
	
	
	public static boolean delete(String username) {
		Connection connection = ConnectionDB.getConnection();
		try {
			PreparedStatement statement = connection.prepareStatement("delete from account where username = ?");
			statement.setString(1, username);
			statement.executeUpdate();
		}catch(SQLException e) {
			System.out.println(e.getMessage());
			return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		Account account = new Account("new1", "passnew", "Nguyễn văn thịnh loooofff", "zvzcvz", "zvczcvzx", "zcvzvz");
		System.out.println(getAccount("admin"));
		
//		System.out.println(getAll());
	}
}
