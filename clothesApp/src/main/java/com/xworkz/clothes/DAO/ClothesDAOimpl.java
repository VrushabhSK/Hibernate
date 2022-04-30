package com.xworkz.clothes.DAO;



import java.util.Date;

import com.xworkz.clothes.Entity.Clothes;

import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.transaction.Transaction;
import lombok.Data;

 public class ClothesDAOimpl implements ClothesDAO {
	
	EntityManagerFactory factory =  Persistence.createEntityManagerFactory("clothes");;
	EntityManager entityManager = null;
	EntityTransaction tx = null;
	Clothes clothes = null;
	Date ManufacturedYear;
	
	@Override
	public void insertCloth(Clothes clothes) {
		
		try {
		//factory = Persistence.createEntityManagerFactory("clothes");
		entityManager = factory.createEntityManager();
		tx=entityManager.getTransaction();
		tx.begin();
		entityManager.persist(clothes);
		tx.commit();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(entityManager!= null)
				entityManager.close();
		}
		
	}

	@Override
	public Clothes getClothesById(Integer clothId) {
		
		try {
		
		entityManager = factory.createEntityManager();
		Clothes  clothes = entityManager.find(Clothes.class, clothId);
		System.out.println(clothes.toString());
		
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(entityManager!=null) {
				entityManager.close();
		}
		}
		return clothes;
	}

	@Override
	 public void updateClothBrandAndPriceById(String Brand , double price , Integer clothId) {
		 
		 
		 
		 entityManager = factory.createEntityManager();
		 Clothes clothes = entityManager.find(Clothes.class, clothId);
		 
		 if(clothes != null) {
			 tx=entityManager.getTransaction();
			 tx.begin();
			 
			 clothes.setBrand(Brand);
			 clothes.setPrice(price);
			 
			 entityManager.merge(clothes);
			 tx.commit();
		 }else {
			 System.out.println("No Record Found...");
		 }
	 }
	 
	 @Override
	 public void updateManufacturedYearById(Date ManufacturedYear , Integer clothId) {
		 
		 try {
		 
		 entityManager = factory.createEntityManager();
		 Clothes clothes = entityManager.find(Clothes.class, clothId);
		 
		 if(clothes!= null) {
			 tx=entityManager.getTransaction();
			 tx.begin();
			 
			 clothes.setManufacturedYear(ManufacturedYear);
			 
			 entityManager.merge(clothes);
			 tx.commit();
		 }else {
			 System.out.println("No Record Found...");
		 }
		 
	 }catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		}finally {
			if (entityManager!=null) {
				entityManager.close();
			}
		}
	 
 }
   @Override
	public void deleteById(Integer clothId) {
	   try {
		entityManager = factory.createEntityManager();
		 Clothes clothes = entityManager.find(Clothes.class, clothId);
		 if(clothes!= null) {
			 tx=entityManager.getTransaction();
			 tx.begin();
			 entityManager.remove(clothes);
			 tx.commit();
		}else {
			 System.out.println("No Record Found...");
		 }
	 
   }catch (Exception e) {
		tx.rollback();
		e.printStackTrace();
	}finally {
		if (entityManager!=null) {
			entityManager.close();
		}
	}
	
   }
 }
