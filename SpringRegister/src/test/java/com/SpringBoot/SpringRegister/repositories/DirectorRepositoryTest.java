package com.SpringBoot.SpringRegister.repositories;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import com.SpringBoot.SpringRegister.models.Director;

@Transactional
@SpringBootTest
@RunWith(SpringRunner.class)
public class DirectorRepositoryTest {

	@Autowired
	private DirectorRepository directorRepository; 
	private Director director; 
	
	@Before	
	public void setup() {
		director = new Director("Martin Scorsese", "xxx", "xxx", "xxxx");				
	}
	
	@Test
	public void saveDirector() {
		directorRepository.save(director); 
		Director directorFound = directorRepository.getOne(director.getId());
		assertEquals(director, directorFound); 
	}
	
	
}
