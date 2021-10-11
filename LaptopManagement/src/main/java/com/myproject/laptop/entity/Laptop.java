package com.myproject.laptop.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
public class Laptop {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String brand;
	private String model;
	private double price;
	private String ram;
	
	
	public Laptop() {
		super();
	}
	public Laptop(String brand, String model, double price, String ram) {
		super();
		this.brand = brand;
		this.model = model;
		this.price = price;
		this.ram = ram;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getRam() {
		return ram;
	}
	public void setRam(String ram) {
		this.ram = ram;
	}

}
