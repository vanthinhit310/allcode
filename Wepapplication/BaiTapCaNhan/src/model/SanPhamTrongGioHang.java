package model;

public class SanPhamTrongGioHang {
	private ThongTinDT thongTinDT;
	private int soLuong;
	private double tongGia;
	public SanPhamTrongGioHang(ThongTinDT thongTinDT, int soLuong) {
		super();
		this.thongTinDT = thongTinDT;
		this.soLuong = soLuong;
		this.tongGia = this.thongTinDT.getGiaDaGiam() * soLuong;
	}
	public ThongTinDT getThongTinDT() {
		return thongTinDT;
	}
	public void setThongTinDT(ThongTinDT thongTinDT) {
		this.thongTinDT = thongTinDT;
	}
	public int getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	public double getTongGia() {
		return tongGia;
	}
	public void setTongGia(double tongGia) {
		this.tongGia = tongGia;
	}
	
	
	
}
