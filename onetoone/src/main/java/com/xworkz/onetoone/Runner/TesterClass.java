package com.xworkz.onetoone.Runner;

import java.math.BigDecimal;

import com.xworkz.onetoone.DAO.PresidentDAO;
import com.xworkz.onetoone.DAO.PresidentDAOImpl;
import com.xworkz.onetoone.entity.CountryEntity;
import com.xworkz.onetoone.entity.PresidentEntity;

public class TesterClass {

	public static void main(String[] args) {
		
		PresidentEntity presidentEntity = new PresidentEntity();
		presidentEntity.setPresidentName("Abdul Kalams");
		presidentEntity.setPresidentId(2);
		presidentEntity.setSalary(new BigDecimal(499999.123));
		
		CountryEntity countryEntity = new CountryEntity();
		countryEntity.setName("India");
		countryEntity.setNoOfStates(30);
		countryEntity.setCountryId(1);
		
		//Providing relationship at run time
		presidentEntity.setCountryEntity(countryEntity);
		
		System.out.println(presidentEntity);
		
		PresidentDAO dao = new PresidentDAOImpl();
		dao.savePresidentAndCountry(presidentEntity, countryEntity);
		System.out.println("Saved Succussfully");
		
		
		

	}

	
	

}
