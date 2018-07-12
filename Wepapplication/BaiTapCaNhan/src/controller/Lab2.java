package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Lab2
 */
@WebServlet("/Lab2")
public class Lab2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Lab2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String ten = request.getParameter("Name");
		String email = request.getParameter("Email");
		String ngay = request.getParameter("date");
		String gender = request.getParameter("gender");
		String username = request.getParameter("User Name");
		String pass = request.getParameter("Password");
		String sdt = request.getParameter("Number");
		String addr = request.getParameter("Your Address");

		String kq = "Ten: " + ten + " Email: " + email + " Ngay sinh: " + ngay + " Gioi tinh: " + gender + " Username: "
				+ username + " Pass: " + pass + " SdT: " + sdt + " Dia chi: " + addr;

		HttpSession session = request.getSession();
		session.setAttribute("kq", kq);
		response.getWriter().print(kq);
		
	}

}
