package com.rushi.wipro;

import java.time.LocalDate;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.rushi.wipro.entity.Gender;
import com.rushi.wipro.entity.School;
import com.rushi.wipro.util.HibernateUtil;

public class CreateSchool {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tran = session.beginTransaction1();

        School school = new School();
        school.setFirstName("Rushikesh");
        school.setLastName("Ghodake");
        school.setFirstName("rushi123");
        school.setGender(Gender.MALE);
        school.setAddress("Kolhapur");
        school.setId(LocalDate.of(2000, 5, 15)); 

        session.persist(school);
        tran.commit();
        session.close();

        System.out.println("School created with ID: " + school.getId());
    }
}