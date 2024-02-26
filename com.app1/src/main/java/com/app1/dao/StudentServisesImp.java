package com.app1.dao;

import java.util.List;

import com.app1.modle.Student;
import com.app1.utils.StudentUtil;

import jakarta.persistence.EntityManager;

public class StudentServisesImp implements StudentServises{

	@Override
	public String addNewStudent(Student student) {
		// TODO Auto-generated method stub
		
		EntityManager em=StudentUtil.provideManager();
		em.getTransaction().begin();
		em.persist(student);
		em.getTransaction().commit();
		
		return  "student has been successfully inserted to db!";
	}

	@Override
	public String update_Student(Student Student) {
		// TODO Auto-generated method stub
		EntityManager em=StudentUtil.provideManager();
		em.getTransaction().begin();
		em.persist(Student);
		em.getTransaction().commit();
		
		return  null;
	}

	@Override
	public List<Student> students() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student findAStudnet(int roll) {
		// TODO Auto-generated method stub
		EntityManager em=StudentUtil.provideManager();
		Student student=em.find(Student.class, roll);
		return student;
	}

	@Override
	public String deleteStudent(int roll) {
		// TODO Auto-generated method stub
		EntityManager em=StudentUtil.provideManager();
		Student student=em.find(Student.class, roll);
		em.getTransaction().begin();
		em.remove(student);
		em.getTransaction().commit();
		return "data has been deleted";
	}

}
