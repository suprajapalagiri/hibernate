package com.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CustomerTest {
public static void main(String[] args) {
	Configuration cfg=new Configuration();
	cfg.configure("com/app/hibernate.cfg.xml");
	SessionFactory sf= cfg.buildSessionFactory();
	Session ses=sf.openSession();
	Transaction tx=ses.beginTransaction();
	Customer cus=new Customer();
	cus.setCustomerId(1);
	cus.setCustomerName("supraja");
	cus.setCustomerAddress("hyd");
	ses.save(cus);
	tx.commit();
	ses.close();
}
}
