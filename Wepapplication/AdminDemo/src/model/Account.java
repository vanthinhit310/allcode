package model;

public class Account {
	private String username;
	private String password;
	private String ten;
	private String email;
	private String sdt;
	private String phanQuyen;
	public Account(String username, String password, String ten, String email, String sdt, String phanQuyen) {
		super();
		this.username = username;
		this.password = password;
		this.ten = ten;
		this.email = email;
		this.sdt = sdt;
		this.phanQuyen = phanQuyen;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSdt() {
		return sdt;
	}
	public void setSdt(String sdt) {
		this.sdt = sdt;
	}
	public String getPhanQuyen() {
		return phanQuyen;
	}
	public void setPhanQuyen(String phanQuyen) {
		this.phanQuyen = phanQuyen;
	}
	
	@Override
	public String toString() {
		return getUsername() + "---"+ getPassword();
	}
}
