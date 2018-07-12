package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.ProductDAO;
import model.SanPhamTrongGioHang;
import model.ThongTinDT;

/**
 * Servlet implementation class Product
 */
@WebServlet("/Product")
public class Product extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Product() {
        super();
        // TODO Auto-generated constructor stub
    }

    public SanPhamTrongGioHang layMotDienThoaiTrongGioHang(String madt, List<SanPhamTrongGioHang> list) {
		try {
			return list.stream().filter(p -> p.getThongTinDT().getMaDT().equals(madt)).findFirst().get();
		} catch (Exception e) {
			return null;
		}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getParameter("action");
		HttpSession session = request.getSession();


		if(action.equals("xoaSP")){
			List<SanPhamTrongGioHang> gioHang = (List<SanPhamTrongGioHang>) session.getAttribute("giohang");
			String id = request.getParameter("maDT");
			boolean a = remove(gioHang,id);

			response.sendRedirect(getServletContext().getContextPath()+"/lab5/giohang.jsp");
		}

		if (action.equals("muahang")) {System.out.println(1);
			if (session.getAttribute("khachhang") != null) {
				List<SanPhamTrongGioHang> gioHang = (List<SanPhamTrongGioHang>) session.getAttribute("giohang");
				String madt = request.getParameter("madt");
				ThongTinDT dt = ProductDAO.getOne(madt);
				SanPhamTrongGioHang dienThoaiTrongGioHang = layMotDienThoaiTrongGioHang(madt, gioHang);
				if (dienThoaiTrongGioHang == null) {
					gioHang.add(new SanPhamTrongGioHang(dt, 1));
				} else {
					dienThoaiTrongGioHang.setSoLuong(dienThoaiTrongGioHang.getSoLuong() + 1);
				}
				session.setAttribute("giohang", gioHang);
				response.sendRedirect(getServletContext().getContextPath() + "/lab5/giohang.jsp");

			} else {
				response.sendRedirect(getServletContext().getContextPath() + "/lab5/loginlab5.jsp");
			}

		}
		if(action.equals("thaydoisl")) {
			System.out.println(2);
			String maSpVaSoLuong = request.getParameter("maspvasl");
			String masp = maSpVaSoLuong.split("_")[0];
			String soLuong = maSpVaSoLuong.split("_")[1];
			
			List<SanPhamTrongGioHang> gioHang = (List<SanPhamTrongGioHang>) session.getAttribute("giohang");
			SanPhamTrongGioHang sanPhamDaXoa= null;
			// tìm sản phẩm có mã như trên và cập nhật lại số lượng
			for(SanPhamTrongGioHang sp: gioHang){
				if(sp.getThongTinDT().getMaDT().equals(masp)) {
					sanPhamDaXoa = sp;
				}
			}
			gioHang.remove(sanPhamDaXoa);
			
			sanPhamDaXoa.setSoLuong(Integer.parseInt(soLuong));
			gioHang.add(sanPhamDaXoa);
			
			
			
			// sau đó sửa lại giỏ hàng
			session.setAttribute("giohang", gioHang);
			
		}
		if(action.equals("xoagiohang")) {
			String maGioHang = request.getParameter(action);
			List<SanPhamTrongGioHang> gioHang = (List<SanPhamTrongGioHang>) session.getAttribute("giohang");
			for(SanPhamTrongGioHang list: gioHang) {
				if(list.getThongTinDT().getMaDT().equals(maGioHang)) {
					gioHang.remove(list);
				}
			}
			response.sendRedirect(getServletContext().getContextPath()+"/lab5/giohang.jsp");
		}

	}
	public static boolean remove(List<SanPhamTrongGioHang> gioHang, String id){
		for(SanPhamTrongGioHang sp: gioHang){
			if(id.equals(sp.getThongTinDT().getMaDT())){
				return gioHang.remove(sp);
			}
		}

		return false;
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
