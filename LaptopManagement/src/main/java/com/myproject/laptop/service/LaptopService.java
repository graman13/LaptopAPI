package com.myproject.laptop.service;

import java.util.List;

import com.myproject.laptop.entity.Laptop;

public interface LaptopService {
	
	List<Laptop> getAllLaptops();
	void deleteById(Long id);
	void addLaptop(Laptop lap);
	void update(Long id, Laptop lap);
	Laptop getLaptopById(Long id);

}
