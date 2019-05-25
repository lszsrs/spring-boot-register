package com.SpringBoot.SpringRegister.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "directors")
public class Director {
	
	@Id
	@GeneratedValue
	private Long Id; 
	private String name;
	private String nextMovie; 
	private String bestAward; 
	private String bestMovie;	
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "director")
	private List<Movie> movies; 
	
	
	public Director() {}
	
	public Director(String name, String nextMovie, String bestAward, String bestMovie) {
		super();
		this.name = name;
		this.nextMovie = nextMovie;
		this.bestAward = bestAward;
		this.bestMovie = bestMovie;
	}
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNextMovie() {
		return nextMovie;
	}
	public void setNextMovie(String nextMovie) {
		this.nextMovie = nextMovie;
	}
	public String getBestAward() {
		return bestAward;
	}
	public void setBestAward(String bestAward) {
		this.bestAward = bestAward;
	}
	public String getBestMovie() {
		return bestMovie;
	}
	public void setBestMovie(String bestMovie) {
		this.bestMovie = bestMovie;
	}
	public List<Movie> getMovies() {
		return movies;
	}
	public void setMovies(List<Movie> movies) {
		this.movies = movies;
	} 
	
	
	
}
