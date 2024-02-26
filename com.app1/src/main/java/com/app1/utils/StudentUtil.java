package com.app1.utils;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class StudentUtil {
	private static EntityManagerFactory emf;
	static {
	 emf=Persistence.createEntityManagerFactory("studentUnit");
	  }
	
   public static EntityManager provideManager() {
	   return emf.createEntityManager();
   }


}
