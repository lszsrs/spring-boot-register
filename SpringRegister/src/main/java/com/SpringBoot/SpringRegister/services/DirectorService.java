package com.SpringBoot.SpringRegister.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.SpringBoot.SpringRegister.models.Director;
import com.SpringBoot.SpringRegister.repositories.DirectorRepository;

public class DirectorService {
	
	@Autowired
	private DirectorRepository directorRepository; 
	
	public void saveDirector(Director director) {
		directorRepository.save(director); 		
	}

}
