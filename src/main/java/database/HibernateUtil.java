package database;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    private static SessionFactory sessionFactory = null;

    static {
        Configuration cfg = new Configuration().configure();
        cfg.addAnnotatedClass(model.KhachHang.class);
        cfg.addAnnotatedClass(model.SanPham.class);
        cfg.addAnnotatedClass(model.TacGia.class);
        cfg.addAnnotatedClass(model.TheLoai.class);
        StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
                .applySettings(cfg.getProperties());
        sessionFactory = cfg.buildSessionFactory(builder.build());
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}