package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Register
 */
@WebServlet("/Register")
public class Lab3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Lab3() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		String Email = request.getParameter("Email");
		String Matkhau = request.getParameter("password");
		String Nhaplaimatkhau = request.getParameter("repass");
		String Hoten = request.getParameter("hoTen");
		String Gioitinh = request.getParameter("gender");
		String Ngaysinh = request.getParameter("ngay");
		String Thang = request.getParameter("thang");
		String Nam = request.getParameter("nam");
		String Sodienthoai = request.getParameter("sdt");
		String Sodidong = request.getParameter("didong");
		String Quocgia = request.getParameter("quocgia");
		String Thanhpho = request.getParameter("thanhpho");
		String Quanhuyen = request.getParameter("quanhuyen");
		String Diachi = request.getParameter("diachi");

		String err_Email = "";
		String err_Matkhau = "";
		String err_Nhaplaimatkhau = "";
		String err_Hoten = "";
		String err_Gioitinh = "";
		String err_Ngaysinh = "";
		String err_Thang = "";
		String err_Nam = "";
		String err_Sodienthoai = "";
		String err_Sodidong = "";
		String err_Quocgia = "";
		String err_Thanhpho = "";
		String err_Quanhuyen = "";
		String err_Diachi = "";
		String kqnguoidungnhap = "Email: " + Email + "<br>" + "Mật khẩu: " + Matkhau +"<br>" + "Họ tên người dùng:  " + Hoten;

		/* DuÌ€ng dÃªÌ‰ lÆ°u dÆ°Ìƒ liÃªÌ£u duÌ€ng chung trong triÌ€nh duyÃªÌ£t. */
		HttpSession session = request.getSession();
		session.setAttribute("err_Email", err_Email);
		session.setAttribute("err_Matkhau", err_Matkhau);
		session.setAttribute("err_Nhaplaimatkhau", err_Nhaplaimatkhau);
		session.setAttribute("err_Hoten", err_Hoten);
		session.setAttribute("err_Gioitinh", err_Gioitinh);
		session.setAttribute("err_Ngaysinh", err_Ngaysinh);
		session.setAttribute("err_Thang", err_Thang);
		session.setAttribute("err_Nam", err_Nam);
		session.setAttribute("err_Sodienthoai", err_Sodienthoai);
		session.setAttribute("err_Sodidong", err_Sodidong);
		session.setAttribute("err_Quocgia", err_Quocgia);
		session.setAttribute("err_Thanhpho", err_Thanhpho);
		session.setAttribute("err_Quanhuyen", err_Quanhuyen);
		session.setAttribute("err_Diachi", err_Diachi);

		session.setAttribute("kqnguoidungnhap", kqnguoidungnhap);

		boolean error = false;

		if (Email == null || Email.equals("")) {
			err_Email = "Vui lòng nhập Email!";
			error = true;
			session.setAttribute("err_Email", err_Email);

		}
		if (Matkhau == null || Matkhau.equals("")) {
			err_Matkhau = "Vui lòng nhập Password!";
			error = true;
			session.setAttribute("err_Matkhau", err_Matkhau);
		}

		if (Nhaplaimatkhau == null || Nhaplaimatkhau.equals("")) {
			err_Nhaplaimatkhau = "Hãy nhập lại Password!";
			error = true;
			session.setAttribute("err_Nhaplaimatkhau", err_Nhaplaimatkhau);
		} else {
			if (!Nhaplaimatkhau.equals(Matkhau)) {
				err_Nhaplaimatkhau = "Password nhập lại không chính xác!";
				error = true;
				session.setAttribute("err_Nhaplaimatkhau", err_Nhaplaimatkhau);
			}
		}

		if (Sodienthoai == null || Sodienthoai.equals("")) {
			err_Sodienthoai = "Vui lòng nhập số điện thoại!";
			error = true;
			session.setAttribute("err_Sodienthoai", err_Sodienthoai);
		} else {
			if (!(Sodienthoai.matches("^\\+?\\d{1,3}?[- .]?\\(?(?:\\d{2,3})\\)?[- .]?\\d\\d\\d[- .]?\\d\\d\\d\\d$"))) {
				err_Sodienthoai = "Định dạng không chính xác. Xin kiểm tra!";
				error = true;
				session.setAttribute("err_Sodienthoai", err_Sodienthoai);
			}
		}
		if (Hoten == null || Hoten.equals("")) {
			err_Hoten = "Vui lòng nhập họ tên!";
			error = true;
			session.setAttribute("err_Hoten", err_Hoten);
		}

		/*
		 * DuÌ€ng Ä‘ÃªÌ‰ laÌ€m chÆ°Ì�c nÄƒng hai taÌ€i khoaÌ‰n khÃ´ng thÃªÌ‰ Ä‘Äƒng nhÃ¢Ì£p cuÌ€ng luÌ�c.
		 * ServletContext context = request.getServletContext();
		 */
		if (error) {
			response.sendRedirect(getServletContext().getContextPath()+"/lab3/signup.jsp");
		} else {
			response.sendRedirect(getServletContext().getContextPath()+"/lab3/dangkithanhcong.jsp");
		}

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}
}
