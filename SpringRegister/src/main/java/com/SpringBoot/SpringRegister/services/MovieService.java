package com.SpringBoot.SpringRegister.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.SpringBoot.SpringRegister.models.Director;
import com.SpringBoot.SpringRegister.models.Movie;
import com.SpringBoot.SpringRegister.repositories.DirectorRepository;
import com.SpringBoot.SpringRegister.repositories.MovieRepository;

@Service
public class MovieService {
		
	private MovieRepository movieRepository;
	private DirectorRepository directorRepository;
	
	@Autowired
	public MovieService(MovieRepository movieRepository, DirectorRepository directorRepository) {
		super();
		this.movieRepository = movieRepository;
		this.directorRepository = directorRepository;
	} 
	
	public void saveMovie(@PathVariable("id") Long id, Movie movie) {
		Director director = directorRepository.getOne(id);
		movie.setDirector(director);
		movieRepository.save(movie); 
		
	}


	
	 
	
}
