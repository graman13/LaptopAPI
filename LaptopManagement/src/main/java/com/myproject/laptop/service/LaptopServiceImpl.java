package com.myproject.laptop.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.myproject.laptop.entity.Laptop;
import com.myproject.laptop.repository.LaptopRepository;

@Service
public class LaptopServiceImpl implements LaptopService{
	
	@Autowired
	private LaptopRepository repo;

	@Override
	public List<Laptop> getAllLaptops() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);;
	}

	@Override
	public void addLaptop(Laptop lap) {
		// TODO Auto-generated method stub
		repo.save(lap);
	}

	@Override
	
	public void update(Long id, Laptop lap) {
		// TODO Auto-generated method stub
		Laptop existingLaptop=repo.findById(id).orElseThrow(null);
		existingLaptop.setBrand(lap.getBrand());
		existingLaptop.setModel(lap.getModel());
		existingLaptop.setPrice(lap.getPrice());
		existingLaptop.setRam(lap.getRam());
		
		repo.save(existingLaptop);
	}

	@Override
	public Laptop getLaptopById(Long id) {
		// TODO Auto-generated method stub
		Optional<Laptop> lap=repo.findById(id);
		Laptop l=new Laptop();
		if(lap.isPresent()) {
			l=lap.get();
		}
		return l;
	}

}
