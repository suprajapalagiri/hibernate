package com.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmployeeTest {
public static void main(String[] args) {
	Configuration cfg=new Configuration();
	cfg.configure("com/app/hibernate.cfg.xml");
	SessionFactory sf= cfg.buildSessionFactory();
	Session ses=sf.openSession();
	Transaction tx=ses.beginTransaction();
	Employee emp=new Employee();
	emp.setEmpCode(222);
	emp.setEmpId(1);
	emp.setEmpName("supraja");
	emp.setEmpSal(20000.0);
	ses.saveOrUpdate(emp);
	tx.commit();
	ses.close();
}
}
