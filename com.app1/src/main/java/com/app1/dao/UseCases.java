package com.app1.dao;

import java.util.Scanner;

import com.app1.modle.Student;

public class UseCases {
	static StudentServises studentServises=new StudentServisesImp();
public static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		findStudent();
		System.out.println("=---------=");
		remove();
//		add_newStudent();
	}
	
	
	public static void  add_newStudent() {
		
		Student student=new Student();
		student.setName("rahul");
		student.setMarks(50);
	System.out.println(	studentServises.addNewStudent(student));
		
	}
	public static void findStudent() {
		System.out.println(studentServises.findAStudnet(2));
	}
	
	public static void remove() {
		System.out.println(studentServises.deleteStudent(4));
	}

}
