package com.xworkz.clothes.DAO;

import java.util.Date;

import com.xworkz.clothes.Entity.Clothes;

public interface ClothesDAO {
	
	 void insertCloth(Clothes clothes);
	public  Clothes getClothesById(Integer clothId);
	void updateClothBrandAndPriceById(String Brand , double price , Integer clothId);
	void updateManufacturedYearById(Date ManufacturedYear , Integer clothId);
	void deleteById(Integer clothId);
}
 