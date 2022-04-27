package com.xworkz.hibernatedemo.JPA;

import com.xworkz.hibernatedemo.entity.ResturantEntity;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class ResturantJPADAO {
	
	public void saveRestaurant(ResturantEntity entity) {

		 EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "JPA" );
         
		 EntityManager entitymanager = emfactory.createEntityManager( );
	      entitymanager.getTransaction( ).begin( );
	      
	      entitymanager.persist(entity);
	      entitymanager.getTransaction( ).commit( );

	      entitymanager.close( );
	      emfactory.close( );

}
}
