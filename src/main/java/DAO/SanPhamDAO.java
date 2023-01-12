package DAO;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import database.HibernateUtil;
import model.SanPham;

public class SanPhamDAO implements DAOinterface<SanPham> {
	public static SanPhamDAO getInstance() {
		return new SanPhamDAO();
	}

	@Override
	public ArrayList<SanPham> selectAll() {
		ArrayList<SanPham> list = new ArrayList<SanPham>();
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		if (sessionFactory != null) {
			try {
				Session session = sessionFactory.openSession();
				String hql = "from SanPham";
				Query query = session.createQuery(hql);
				list = (ArrayList<SanPham>) query.getResultList();
				session.close();
			} catch (HibernateException e) {
				e.printStackTrace();
			}
		}
		return list;
	}

	@Override
	public SanPham selectById(SanPham t) {
		SanPham result = new SanPham();
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		if (sessionFactory != null) {
			try {
				Session session = sessionFactory.openSession();
				Transaction transaction = session.beginTransaction();
				result = (SanPham) session.get(SanPham.class, t.getMaSanPham());
				transaction.commit();
				session.close();
			} catch (HibernateException e) {
				e.printStackTrace();
			}
		}
		return result;
	}

	@Override
	public int insert(SanPham t) {
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
			} catch (HibernateException e) {
				e.printStackTrace();
			}
		}
		return result;
	}

	@Override
	public int insertAll(ArrayList<SanPham> arr) {
		int count = 0;
		for (SanPham sanPham : arr) {
			count+=this.insert(sanPham);
		}
		return count;
	}

	@Override
	public int delete(SanPham t) {
		int result=0;
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		if(sessionFactory!=null) {
			try {
				Session session = sessionFactory.openSession();
				Transaction transaction = session.beginTransaction();
				session.delete(t);
				transaction.commit();
				session.close();
			} catch (Exception e) {
				System.out.println(e+" delete SanPhamDAO");
			}
		}
		return result;
	}

	@Override
	public int deleteAll(ArrayList<SanPham> arr) {
		int count = 0;
		for (SanPham sanPham : arr) {
			count+=this.delete(sanPham);
		}
		return count;
	}

	@Override
	public int update(SanPham t) {
		int result=0;
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		if(sessionFactory!=null) {
			try {
				Session session = sessionFactory.openSession();
				Transaction transaction = session.beginTransaction();
				session.saveOrUpdate(t);
				transaction.commit();
				session.close();
			} catch (Exception e) {
				System.out.println(e+" delete SanPhamDAO");
			}
		}
		return result;
	}

}
