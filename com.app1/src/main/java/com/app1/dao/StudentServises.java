package com.app1.dao;

import java.util.List;

import com.app1.modle.Student;

public interface StudentServises {
	public String  addNewStudent(Student student);
	public String update_Student(Student Student);
	public List<Student> students();
	public Student findAStudnet(int roll);
	public String deleteStudent(int roll);

}
