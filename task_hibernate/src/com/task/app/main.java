package com.task.app;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.task.app.model.Author;
import com.task.app.model.Book;
import com.task.app.model.Car;
import com.task.app.model.Category;
import com.task.app.model.Customer;
import com.task.app.model.Department;
import com.task.app.model.Doctor;
import com.task.app.model.Driver;
import com.task.app.model.Employee;
import com.task.app.model.Liberary;
import com.task.app.model.Orders;
import com.task.app.model.Passport;
import com.task.app.model.Patient;
import com.task.app.model.Project;
import com.task.app.model.Roles;
import com.task.app.model.Student;
import com.task.app.model.Subject;
import com.task.app.model.Teacher;

import com.task.app.model.Users1;
import com.task.app.model.product;

public class main {

	public static void main(String[] args) {
		
		org.hibernate.cfg.Configuration configuration = new org.hibernate.cfg.Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Car.class)
				.addAnnotatedClass(Driver.class);
		
		
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.getCurrentSession();
		
		
		factory.close();
		session.close();
	}

}









