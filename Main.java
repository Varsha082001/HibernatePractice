package com.demohiber;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {


//        Alien a1 = new Alien();
//        a1.setAid(103);
//        a1.setAname("Jay");
//        a1.setTech("Gen AI");

        //Hyy Hibernate save with a1 object
//        Configuration config = new Configuration();
//        config.addAnnotatedClass(com.demohiber.Alien.class);
//        config.configure();
        
        SessionFactory factory = new Configuration()
                .addAnnotatedClass(com.demohiber.Alien.class)
                .configure()
                .buildSessionFactory();
       Session session = factory.openSession();

        //Transaction transaction = session.beginTransaction();

        //session.persist(a1);

        Alien a1 = session.get(Alien.class, 103);

        //transaction.commit();

        System.out.println(a1);
        session.close();
        factory.close();


        }
    }

