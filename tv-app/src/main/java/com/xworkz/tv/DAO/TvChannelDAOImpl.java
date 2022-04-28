package com.xworkz.tv.DAO;


import com.xworkz.tv.entity.TVChannel;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class TvChannelDAOImpl implements TvChannelDAO {
	
	EntityManagerFactory factory = null;
	EntityManager entityManager = null;
	EntityTransaction tx= null;
	
	@Override
	public void saveChannel(TVChannel tvchannel) {
		
	
	try {
	factory = Persistence.createEntityManagerFactory("tv");
	entityManager = factory.createEntityManager();
	tx= entityManager.getTransaction();
	tx.begin();
	entityManager.persist(tvchannel);
	tx.commit();
	
	
	}catch(Exception e) {
		e.printStackTrace();
	}finally {
		if(entityManager!=null)
			entityManager.close();
	}

}
	@Override
	public void readChannel() {
		
		try {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("tv");
		EntityManager entityManager = factory.createEntityManager();
		TVChannel tvChannel1= entityManager.find(TVChannel.class, 1);
		System.out.println(tvChannel1.toString());
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(entityManager!=null)
				entityManager.close();
		}
	}
}
