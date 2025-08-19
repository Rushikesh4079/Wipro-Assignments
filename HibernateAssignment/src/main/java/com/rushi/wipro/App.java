package com.rushi.wipro;
import org.hibernate.Session;
import com.rushi.wipro.util.HibernateUtil;

public class App {
    public static void main(String[] args) {

        Session session = HibernateUtil.getSessionFactory().openSession();
        session.close();

        System.out.println("School table created successfully");
    }
}