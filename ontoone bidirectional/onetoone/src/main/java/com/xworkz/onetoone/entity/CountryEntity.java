package com.xworkz.onetoone.entity;

import java.math.BigDecimal;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "country")

public class CountryEntity { // Only Entity

	@Id
	@GenericGenerator(name = "auto1", strategy = "increment")
	@GeneratedValue(generator = "auto1")
	private int countryId;
	private String name;
	private int noOfStates;
	
	@OneToOne(mappedBy = "country")  //BiDirectional
	private PresidentEntity presidentEntity;

}
