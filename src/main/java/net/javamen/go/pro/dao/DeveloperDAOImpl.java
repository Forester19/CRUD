package net.javamen.go.pro.dao;

import net.javamen.go.pro.model.Developer;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

import org.slf4j.*;

/**
 * Created by Владислав on 13.05.2017.
 */

@Repository
public class DeveloperDAOImpl implements DeveloperDAO {
    private static final Logger logger = LoggerFactory.getLogger(DeveloperDAOImpl.class);

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public void addDeveloper(Developer developer) {
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(developer);
        logger.info("Developer successfully saved. Developer details: " + developer.toString() + " .");
    }

    public void updateDeveloper(Developer developer) {
        Session session = this.sessionFactory.getCurrentSession();
        session.update(developer);
        logger.info("Developer successfully updated. Developer details: " + developer.toString() + " .");

    }

    public void removeDeveloper(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        Developer developer= (Developer) session.load(Developer.class,new Integer(id));
        if (developer != null) session.delete(developer);
        logger.info("Developer successfully removed. Developer details: " + developer.toString() + " .");

    }

    public Developer getById(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        Developer developer = (Developer) session.load(Developer.class,new Integer(id));

        logger.info("Developer successfully loaded. Developer details: " + developer.toString() + " .");

        return developer;
    }
    @SuppressWarnings("unchecked")
    public List<Developer> getListDevelopers() {
        Session session = this.sessionFactory.getCurrentSession();

        @SuppressWarnings("JpaQlInspection")
        Query query= session.createQuery("from Developers");

        List<Developer> list = query.list();

        logger.info("Successfully get list developers ");
        for (Developer developer: list){
            logger.info(developer.toString());
        }
        return list;
    }
}
