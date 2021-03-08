package com.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StudentTest {
public static void main(String[] args) {
	Configuration cfg=new Configuration();
	cfg.configure("com/app/hibernate.cfg.xml");
	SessionFactory sf=cfg.buildSessionFactory();
	Session ses=sf.openSession();
	Transaction tran=ses.beginTransaction();
	Student std=new Student();
	std.setStudentId(1);
	std.setStudentName("supraja");
	std.setStudentAge(24);
	ses.save(std);
	tran.commit();
	ses.close();
	
}
}
