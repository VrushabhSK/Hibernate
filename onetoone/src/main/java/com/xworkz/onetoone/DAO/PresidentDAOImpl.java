package com.xworkz.onetoone.DAO;

import com.xworkz.onetoone.entity.CountryEntity;
import com.xworkz.onetoone.entity.PresidentEntity;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class PresidentDAOImpl implements PresidentDAO {

	EntityManagerFactory factory = null;
	EntityManager entityManager = null;
	EntityTransaction tx = null;

	public void savePresidentAndCountry(PresidentEntity presidentEntity, CountryEntity countryEntity) {

		try {
			factory = Persistence.createEntityManagerFactory("one-to-one");
			entityManager = factory.createEntityManager();
			tx = entityManager.getTransaction();
			tx.begin();
			entityManager.persist(presidentEntity);
			entityManager.persist(countryEntity);
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		} finally {
			if (entityManager != null) {
				entityManager.close();
			}
		}

	}

}
