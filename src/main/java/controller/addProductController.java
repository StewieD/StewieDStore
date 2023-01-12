package controller;

import java.io.IOException;
import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.SanPhamDAO;
import model.SanPham;

/**
 * Servlet implementation class addProductController
 */
@WebServlet("/add-product")
public class addProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public addProductController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String tenSanPham = request.getParameter("tenSanPham");
		String tacGia = request.getParameter("tacGia");
		String namXuatBan = request.getParameter("namXuatBan");
		String theLoai = request.getParameter("theLoai");
		String ngonNgu = request.getParameter("ngonNgu");
		String moTa = request.getParameter("moTa");
		String giaNhap = request.getParameter("giaNhap");
		String giaBia = request.getParameter("giaBia");
		String giaBan = request.getParameter("giaBan");
		String soLuong = request.getParameter("soLuong");

		String url="/product.jsp";
		String error = "";
		String success_msg="";
		if (error.length() > 0) {
			request.setAttribute("tenSanPham", tenSanPham);
			request.setAttribute("tenSanPham", tenSanPham);
			request.setAttribute("tacGia", tacGia);
			request.setAttribute("namXuatBan", namXuatBan);
			request.setAttribute("theLoai", theLoai);
			request.setAttribute("ngonNgu", ngonNgu);
			request.setAttribute("moTa", moTa);
			request.setAttribute("giaNhap", giaNhap);
			request.setAttribute("giaBia", giaBia);
			request.setAttribute("giaBan", giaBan);
			request.setAttribute("soLuong", soLuong);
		} else {
			Random random = new Random();
			String maSanPham = System.currentTimeMillis()+random.nextInt(1000)+"";
			SanPham sanPham = new SanPham(maSanPham, tenSanPham, Integer.valueOf(namXuatBan),  Double.valueOf(giaNhap),  Double.valueOf(giaBia),  Double.valueOf(giaBan),  Integer.valueOf(soLuong), ngonNgu, moTa);
			if(SanPhamDAO.getInstance().insert(sanPham)>0) {
				success_msg = "Đăng sản phẩm thành công";
				request.setAttribute("success_msg", success_msg);
			}
		}
		RequestDispatcher rd = request.getRequestDispatcher(url);
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
