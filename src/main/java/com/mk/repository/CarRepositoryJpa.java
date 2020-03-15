package main.java.com.mk.repository;

        import main.java.com.mk.config.HibernateUtil;
        import main.java.com.mk.domain.Car;
        import main.java.com.mk.repository.impl.CarRepository;
        import org.hibernate.Hibernate;
        import org.hibernate.Session;
        import org.hibernate.Transaction;

public class CarRepositoryJpa implements CarRepository {
    public void save(Car car) {
        Transaction tx = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()){
            tx = session.beginTransaction();
            session.save(car);
            tx.commit();
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        }
    }
}
