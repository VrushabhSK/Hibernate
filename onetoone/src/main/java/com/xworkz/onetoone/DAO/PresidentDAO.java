package com.xworkz.onetoone.DAO;

import com.xworkz.onetoone.entity.CountryEntity;
import com.xworkz.onetoone.entity.PresidentEntity;

public interface PresidentDAO {
	
public	void savePresidentAndCountry(PresidentEntity presidentEntity, CountryEntity countryEntity);

}
