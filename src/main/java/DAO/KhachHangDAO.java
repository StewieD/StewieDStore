package DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import database.HibernateUtil;
import model.KhachHang;

public class KhachHangDAO implements DAOinterface<KhachHang> {

	public ArrayList<KhachHang> data = new ArrayList<>();

	public static KhachHangDAO getInstance() {
		return new KhachHangDAO();
	}

	@Override
	public ArrayList<KhachHang> selectAll() {
		ArrayList<KhachHang> results = new ArrayList<KhachHang>();
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		if (sessionFactory != null) {
			try {
				// Bước 1: tạo kết nối đến CSDL
				Session session = sessionFactory.openSession();
				Transaction transaction = session.beginTransaction();
				String hql = "from KhachHang";
				Query query = session.createQuery(hql);
				results = (ArrayList<KhachHang>) query.getResultList();
				transaction.commit();
				session.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return results;

	}

	@Override
	public KhachHang selectById(KhachHang t) {
		KhachHang result = null;
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		if (sessionFactory != null) {
			try {
				Session session = sessionFactory.openSession();
				Transaction transaction = session.beginTransaction();
				result = session.get(KhachHang.class, t.getMaKhachHang());
				transaction.commit();
				session.close();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		return result;
	}

	@Override
	public int insert(KhachHang t) {
		int result = 0;
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		if (sessionFactory != null) {
			try {
				Session session = sessionFactory.openSession();
				Transaction transaction = session.beginTransaction();
				session.save(t);
				transaction.commit();
				session.close();
				result = 1;
			} catch (Exception e) {
				e.printStackTrace();
				return 0;
			}
		}
		return result;
	}

	@Override
	public int insertAll(ArrayList<KhachHang> arr) {
		int dem = 0;
		for (KhachHang KhachHang : arr) {
			dem += this.insert(KhachHang);
		}
		return dem;
	}

	@Override
	public int delete(KhachHang t) {
		int ketQua = 0;
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		if (sessionFactory != null) {
			try {
				Session session = sessionFactory.openSession();
				Transaction transaction = session.beginTransaction();
				session.delete(t);
				transaction.commit();
				session.close();
				ketQua = 1;
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		return ketQua;
	}

	@Override
	public int deleteAll(ArrayList<KhachHang> arr) {
		int dem = 0;
		for (KhachHang KhachHang : arr) {
			dem += this.delete(KhachHang);
		}
		return dem;
	}

	@Override
	public int update(KhachHang t) {
		int ketQua = 0;
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		if (sessionFactory != null) {
			try {
				Session session = sessionFactory.openSession();
				Transaction transaction = session.beginTransaction();
				session.update(t);
				transaction.commit();
				session.close();
				ketQua = 1;
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		return ketQua;
	}

	public boolean changePassWord(KhachHang t) {
		int ketQua = 0;
//		try {
//			// Bước 1: tạo kết nối đến CSDL
//			Connection con = JDBCUtil.getConnection();
//
//			// Bước 2: tạo ra đối tượng statement
//			String sql = "UPDATE khachhang " + " SET " + "matkhau=? " + "WHERE makhachhang=?";
//
//			PreparedStatement st = con.prepareStatement(sql);
//			st.setString(1, t.getMatKhau());
//			st.setString(2, t.getMaKhachHang());
//			// Bước 3: thực thi câu lệnh SQL
//
//			System.out.println(sql);
//			ketQua = st.executeUpdate();
//			// Bước 4:
//			System.out.println("Bạn đã thực thi: " + sql);
//			System.out.println("Có " + ketQua + " dòng bị thay đổi!");
//
//			// Bước 5:
//			JDBCUtil.closeConnection(con);
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		if (sessionFactory != null) {
			try {
				Session session = sessionFactory.openSession();
				Transaction transaction = session.beginTransaction();
				String hql = "update KhachHang set matKhau = :matKhau " + " where maKhachHang = :maKhachHang";
				Query query = session.createQuery(hql);

				query.setParameter("matKhau", t.getMatKhau());
				query.setParameter("maKhachHang", t.getMaKhachHang());

				ketQua = query.executeUpdate();
				transaction.commit();
				session.close();
				ketQua = 1;
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		return ketQua > 0;
	}

	public int changeInfo(KhachHang t) {
		int ketQua = 0;
//		try {
//			// Bước 1: tạo kết nối đến CSDL
//			Connection con = JDBCUtil.getConnection();
//
//			// Bước 2: tạo ra đối tượng statement
//			String sql = "UPDATE khachhang " + " SET " + " hoten=?" + ", gioitinh=?" + ", diachi=?"
//					+ ", diachinhanhang=?" + ", ngaysinh=?" + ", sodienthoai=?" + ", email=?" + ", dangkinhanbangtin=?"
//					+ " WHERE makhachhang=?";
//
//			PreparedStatement st = con.prepareStatement(sql);
//
//			st.setString(1, t.getHoVaTen());
//			st.setString(2, t.getGioiTinh());
//			st.setString(3, t.getDiaChi());
//			st.setString(4, t.getDiaChiNhanHang());
//			st.setDate(5, t.getNgaySinh());
//			st.setString(6, t.getSoDienThoai());
//			st.setString(7, t.getEmail());
//			st.setBoolean(8, t.getDangKyEmail());
//			st.setString(9, t.getMaKhachHang());
//			// Bước 3: thực thi câu lệnh SQL
//			System.out.println("Bạn đã thực thi: " + sql);
//			ketQua = st.executeUpdate();
//
//			// Bước 4:
//			System.out.println("Bạn đã thực thi: " + sql);
//			System.out.println("Có " + ketQua + " dòng bị thay đổi!");
//
//			// Bước 5:
//			JDBCUtil.closeConnection(con);
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		if (sessionFactory != null) {
			try {
				Session session = sessionFactory.openSession();
				Transaction transaction = session.beginTransaction();
				String hql = "update KhachHang set hoVaTen = :hoVaTen, gioiTinh=:gioiTinh, diaChi=:diaChi, diaChiNhanHang=:diaChiNhanHang, ngaySinh=:ngaySinh, soDienThoai=:soDienThoai, email=:email, dangKyEmail=:dangKyEmail  "
						+ " where maKhachHang = :maKhachHang";
				Query query = session.createQuery(hql);

				query.setParameter("hoVaTen", t.getHoVaTen());
				query.setParameter("gioiTinh", t.getGioiTinh());
				query.setParameter("diaChi", t.getDiaChi());
				query.setParameter("diaChiNhanHang", t.getDiaChiNhanHang());
				query.setParameter("ngaySinh", t.getNgaySinh());
				query.setParameter("soDienThoai", t.getSoDienThoai());
				query.setParameter("email", t.getEmail());
				query.setParameter("dangKyEmail", t.getDangKyEmail());
				query.setParameter("maKhachHang", t.getMaKhachHang());

				ketQua = query.executeUpdate();
				transaction.commit();
				session.close();
				ketQua = 1;
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		return ketQua;
	}

	public int updateAvatar(KhachHang t) {
		int ketQua = 0;
//		try {
//			// Bước 1: tạo kết nối đến CSDL
//			Connection con = JDBCUtil.getConnection();
//
//			// Bước 2: tạo ra đối tượng statement
//			String sql = "UPDATE khachhang " + " SET " + " avatar=?" + " WHERE makhachhang=?";
//
//			PreparedStatement st = con.prepareStatement(sql);
//			st.setString(1, t.getAvatar());
//			st.setString(2, t.getMaKhachHang());
//			// Bước 3: thực thi câu lệnh SQL
//			System.out.println("Bạn đã thực thi: " + sql);
//			System.out.println(sql);
//			ketQua = st.executeUpdate();
//
//			// Bước 4:
//			System.out.println("Bạn đã thực thi: " + sql);
//			System.out.println("Có " + ketQua + " dòng bị thay đổi!");
//
//			// Bước 5:
//			JDBCUtil.closeConnection(con);
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		if (sessionFactory != null) {
			try {
				Session session = sessionFactory.openSession();
				Transaction transaction = session.beginTransaction();
				String hql = "update KhachHang set avatar = :avatar " + " where maKhachHang = :maKhachHang";
				Query query = session.createQuery(hql);

				query.setParameter("avatar", t.getAvatar());
				query.setParameter("maKhachHang", t.getMaKhachHang());

				ketQua = query.executeUpdate();
				transaction.commit();
				session.close();
				ketQua = 1;
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		return ketQua;
	}

	public int updateAuthentication(KhachHang t) {
		int ketQua = 0;
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		if (sessionFactory != null) {
			try {
				Session session = sessionFactory.openSession();
				Transaction transaction = session.beginTransaction();
				String hql = "update KhachHang set maXacThuc = :maXacThuc, thoiGianXacThuc=:thoiGianXacThuc, trangThaiXacThuc=:trangThaiXacThuc  "
						+ " where maKhachHang = :maKhachHang";
				Query query = session.createQuery(hql);
				query.setParameter("maXacThuc", t.getMaXacThuc());
				query.setParameter("thoiGianXacThuc", t.getThoiGianXacThuc());
				query.setParameter("trangThaiXacThuc", t.isTrangThaiXacThuc());
				query.setParameter("maKhachHang", t.getMaKhachHang());
				ketQua = query.executeUpdate();
				transaction.commit();
				session.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return ketQua;
	}

	public KhachHang selectByIdAndPassWord(KhachHang t) {
		KhachHang ketQua = null;
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		if (sessionFactory != null) {
			try {
				Session session = sessionFactory.openSession();
				Transaction transaction = session.beginTransaction();
				String hql = "from KhachHang where tenDangNhap like :username and matKhau like :password";
				Query query = session.createQuery(hql);
				query.setParameter("username", t.getTenDangNhap());
				query.setParameter("password", t.getMatKhau());
				ketQua = (KhachHang) query.getSingleResult();
				System.out.println(ketQua.toString());
				transaction.commit();
				session.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return ketQua;
	}

	public KhachHang selectByUserName(KhachHang t) {
		KhachHang ketQua = null;
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		if (sessionFactory != null) {
			try {
				Session session = sessionFactory.openSession();
				Transaction transaction = session.beginTransaction();
				String hql = "from KhachHang where tenDangNhap like :username";
				Query query = session.createQuery(hql);
				query.setParameter("username", t.getTenDangNhap());
				ketQua = (KhachHang) query.getSingleResult();
				transaction.commit();
				session.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		return ketQua;
	}

	public boolean checkExistUserName(String username) {
		boolean ketQua = false;
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		if (sessionFactory != null) {
			try {
				Session session = sessionFactory.openSession();
				Transaction transaction = session.beginTransaction();

				String hql = "from KhachHang where tenDangNhap like :username";
				Query query = session.createQuery(hql);
				query.setParameter("username", username);
				ketQua = (query.getSingleResult() != null) ? true : false;
				System.out.println(query.getSingleResult());
				System.out.println("Kết quả check toàn tại " + ketQua);
				transaction.commit();
				session.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return ketQua;
	}
}
