package com.xworkz.hibernatedemo.Runner;


import com.xworkz.hibernatedemo.JPA.ResturantJPADAO;
import com.xworkz.hibernatedemo.entity.ResturantEntity;

public class JPATester {
           
	public static void main(String[] args) {
		ResturantEntity entity = new ResturantEntity();
		// by default it will take preparedStatements rather than the statement.
		
		entity.setId(2);
		entity.setName("Vidhyarthi Bhavan");
		entity.setContactNo(9740945);
		entity.setRating(7.2);
		entity.setType("veg");
		
		ResturantJPADAO restaurantJPADAO = new ResturantJPADAO();
		restaurantJPADAO.saveRestaurant(entity);
		System.out.println("Saved successfully");
	}
}
