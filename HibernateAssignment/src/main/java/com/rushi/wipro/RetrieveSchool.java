package com.rushi.wipro;

import org.hibernate.Session;

import com.rushi.wipro.entity.School;
import com.rushi.wipro.util.HibernateUtil;

public class RetrieveSchool {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();

        int schoolId = 1;
        School school = session.get(School.class, schoolId);

        if (school != null) {
            System.out.println("Name: " + school.getFirstName() + " " + school.getLastName());
            System.out.println("DOB: " + school.getId());
        } else {
            System.out.println("School not found");
        }

        session.close();
    }
}