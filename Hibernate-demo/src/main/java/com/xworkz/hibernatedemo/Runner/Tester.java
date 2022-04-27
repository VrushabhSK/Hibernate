package com.xworkz.hibernatedemo.Runner;

import com.xworkz.hibernatedemo.DAO.ResturantDAO;
import com.xworkz.hibernatedemo.entity.ResturantEntity;

public class Tester {
	
	public static void main(String[] args) {
		ResturantEntity restaurantEntity = new ResturantEntity();
		// by default it will take preparedStatements rather than the statement.
		
		restaurantEntity.setId(1);
		restaurantEntity.setName("Udupi grand");
		restaurantEntity.setContactNo(9740935);
		restaurantEntity.setRating(7.2);
		restaurantEntity.setType("veg");
		
		ResturantDAO restaurantDAO = new ResturantDAO();
		restaurantDAO.saveRestaurant(restaurantEntity);
		System.out.println("Saved successfully");
	}

}
