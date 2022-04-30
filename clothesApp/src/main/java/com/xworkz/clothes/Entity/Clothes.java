package com.xworkz.clothes.Entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;

@Data
@Entity
@Table(name = "clothes")
public class Clothes {
	
	@Id
	@Column
	private int id;
	private String brand;
	private double price;
	
	private Date ManufacturedYear;
		
		
	}


