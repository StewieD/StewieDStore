package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import database.HibernateUtil;
import model.KhachHang;

public class testKhachHangDAO {
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		KhachHang khachHang = new KhachHang();
		khachHang.setMaKhachHang("A01");
		khachHang.setHoVaTen("Nguyễn Văn Tí Em");
		if (sessionFactory != null) {
			try {
				Session session = sessionFactory.openSession();
				Transaction transaction = session.beginTransaction();
				session.save(khachHang);
				transaction.commit();
				session.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
