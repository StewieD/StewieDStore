package test;

import java.util.Random;

import DAO.SanPhamDAO;
import model.SanPham;

public class testSanPhamDAO {
	public static void main(String[] args) {
		Random random = new Random();
		String maKhachHang = System.currentTimeMillis() + random.nextInt(1000) + "";
		System.out.println(maKhachHang);
	}
}
