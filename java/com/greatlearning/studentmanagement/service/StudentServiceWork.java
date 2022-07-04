package com.greatlearning.studentmanagement.service;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.greatlearning.studentmanagement.model.Student;

@Repository
public class StudentServiceWork {

	private Session session;

	@Autowired
	public StudentServiceWork(SessionFactory sessionFactory) {
		this.session = sessionFactory.openSession();
		try {
			session = sessionFactory.getCurrentSession();
		} catch (HibernateException e) {
			session = sessionFactory.openSession();
		}
	}

	@Transactional
	public List<Student> findAll() {
		Transaction tx = session.beginTransaction();
		List<Student> studentList = session.createQuery("from Student", Student.class).list();
		tx.commit();
		return studentList;
	}

	@Transactional
	public Student findById(int id) {
		Transaction tx = session.beginTransaction();
		Student student = session.get(Student.class, id);
		tx.commit();
		return student;
	}

	@Transactional
	public void save(Student theStudent) {
		Transaction tx = session.beginTransaction();
		session.saveOrUpdate(theStudent);
		tx.commit();
	}

	@Transactional
	public void deleteById(int theId) {
		Transaction tx = session.beginTransaction();
		Student student = (Student) session.load(Student.class, theId);
		System.out.println(student);
		if (student != null) {
			session.delete(student);
		}

		tx.commit();

	}

}
