package com.myproject.laptop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.myproject.laptop.entity.Laptop;

import com.myproject.laptop.service.LaptopServiceImpl;

@RestController			
public class LaptopController {
	
	@Autowired
	private LaptopServiceImpl service;
	
	@GetMapping(value="/laptops",produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
	public ResponseEntity<List<Laptop>> getAllLaptops(){
		return new ResponseEntity<List<Laptop>>(service.getAllLaptops(), HttpStatus.OK);
	}
	
	@GetMapping(value="/laptopslist",produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
	public List<Laptop> getListLaptops(){
		return service.getAllLaptops();
	}
	
	@GetMapping(value="/{id}", produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
	public Laptop getById(@PathVariable Long id) {
		return service.getLaptopById(id);
	}
	
	@PostMapping(value="/addlaptop")
	public void addLaptop(@RequestBody Laptop lap) {
		 service.addLaptop(lap);
	}
	
	@DeleteMapping(value="/delete/{id}")
	public void deleteById(@PathVariable Long id) {
		service.deleteById(id);
	}
	
	@PutMapping("/update/{id}")
	
	public void update(@PathVariable("id") Long id,@RequestBody Laptop lap) {
		service.update(id,lap);
	}
	
	
}
