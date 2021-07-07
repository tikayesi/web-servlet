package com.shopee.config;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateConfig {
        private static SessionFactory sessionFactory;

        public static SessionFactory getSessionFactory(){
            if (sessionFactory == null) {
                Configuration configutation = new Configuration();
                sessionFactory = configutation.configure("Hibernate.cfg.xml").buildSessionFactory();
            }
            return sessionFactory;
        }


    }
