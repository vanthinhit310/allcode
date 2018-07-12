package model;

public class Account {
	private int id;
	private String name;
	private String email;
	private String password;
	private String sdt;
	private String phanquyen;

	public Account(int id, String name, String email, String password, String sdt, String phanquyen) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.sdt = sdt;
		this.phanquyen = phanquyen;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSdt() {
		return sdt;
	}

	public void setSdt(String sdt) {
		this.sdt = sdt;
	}

	public String getPhanquyen() {
		return phanquyen;
	}

	public void setPhanquyen(String phanquyen) {
		this.phanquyen = phanquyen;
	}
}
