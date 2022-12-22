package org.nit.HibarnateFirstApp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        Configuration cfg=new Configuration().configure("hibernate.cfg.xml");
        SessionFactory buildSessionFactory = cfg.buildSessionFactory();
        Session session=buildSessionFactory.openSession();
        
        Transaction tx=session.beginTransaction();
        	Person p=new Person();
        	p.setId(101);
        	p.setName("Rahul");
        	p.setAddress("Jalgaon");
        session.save(p);
        
        Person p1=new Person();
    	p1.setId(102);
    	p1.setName("Jay");
    	p1.setAddress("Varangaon");
    	
    	session.save(p1);
        tx.commit();

        session.close();
        buildSessionFactory.close();
        
    }
}
