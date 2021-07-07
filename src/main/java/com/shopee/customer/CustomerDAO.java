package com.shopee.customer;

import com.shopee.config.HibernateConfig;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.persistence.Query;
import java.util.List;

public class CustomerDAO {

    public List<Customer> getAllCustomer(){
        Session session = HibernateConfig.getSessionFactory().openSession();
        Query query = session.createQuery("FROM Customer ");
        return query.getResultList();
    }

    public void save(Customer customer){
        Session session = HibernateConfig.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(customer);
        transaction.commit();
        session.close();
    }
}
