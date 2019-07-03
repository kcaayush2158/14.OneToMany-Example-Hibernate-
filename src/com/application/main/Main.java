package com.application.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.application.model.UserDetails;
import com.application.model.Vehicle;

public class Main {
    public static void main(String[] args) {
        UserDetails userdetails = new UserDetails();
        userdetails.setUsername("aayush");

        Vehicle vehicle = new Vehicle();
        vehicle.setVehicleName("ferari");
        userdetails.setVehicle(vehicle);

        SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(userdetails);
        session.getTransaction().commit();

        session.close();
    }
}
