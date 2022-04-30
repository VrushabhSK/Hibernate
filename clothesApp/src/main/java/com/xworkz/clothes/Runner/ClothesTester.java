package com.xworkz.clothes.Runner;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.xworkz.clothes.DAO.ClothesDAO;
import com.xworkz.clothes.DAO.ClothesDAOimpl;
import com.xworkz.clothes.Entity.Clothes;

public class ClothesTester {
	
	public static void main(String[] args) {
		
		Clothes clothes = new Clothes();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		clothes.setId(2);
		clothes.setBrand("PeterEngland");
		clothes.setPrice(1997);
    	Date ManufactturedYear = null;
		try {
			ManufactturedYear = simpleDateFormat.parse("2019-04-09");
			clothes.setManufacturedYear(ManufactturedYear);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		
		
		ClothesDAOimpl clothesDAO = new ClothesDAOimpl();
		//clothesDAO.insertCloth(clothes);
		//System.out.println("Succussfully inserted");
		//clothesDAO. getClothesById(1);
		//System.out.println("Fetching Succussful");
        // clothesDAO.updateClothBrandAndPriceById("Arrow", 1500, 1);
         //System.out.println("Updated Succussful");
		/* try {
			ManufactturedYear = simpleDateFormat.parse("2023-01-01");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		// clothesDAO.updateManufacturedYearById(ManufactturedYear, 10);
		 //System.out.println("update of ManufacturedYear By Id Succussful");
		 clothesDAO.deleteById(10);
		 System.out.println("Delete Succussful");
		 
		 
       
	}

}
