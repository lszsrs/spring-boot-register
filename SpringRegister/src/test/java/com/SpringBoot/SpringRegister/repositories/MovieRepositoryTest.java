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
import com.SpringBoot.SpringRegister.models.Movie;


@Transactional
@SpringBootTest
@RunWith(SpringRunner.class)
public class MovieRepositoryTest {

	@Autowired
	private MovieRepository movieRepository; 
	private Movie movie; 
	private Director director;
	
	@Before	
	public void setup() {
		director = new Director("William Wyler", "xxx", "xxx", "xxxx");
		movie = new Movie("Roman Holiday", 1, "October 5, 1953", "xxx", director);				
	}
	
	@Test
	public void saveDirector() {
		movieRepository.save(movie); 
		Movie movieFound = movieRepository.getOne(movie.getId());
		assertEquals(movie, movieFound); 
	}
	
}
