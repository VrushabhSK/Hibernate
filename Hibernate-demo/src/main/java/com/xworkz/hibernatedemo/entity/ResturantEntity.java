package com.xworkz.hibernatedemo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data// lombok property by default it has setter,getter(),toString(),hashCode(),equals() which helps developer to do no write those methods.
//after updating the java version we have "record" instead of lombok external software.

@Entity  // to tell that which class is entity.

@Table(name = "restuarant")  // to map the entity class to table
public class ResturantEntity {
	
	@Id // to tell the which is primary key.
	@Column(name = "id") // column to class member mapping(if both names are diff)
	private int id;
	
	private long contactNo;
	@Column(name = "name") // column to class member mapping(if both names are diff)
	private String name;
	private double rating;
	private String type;


}
