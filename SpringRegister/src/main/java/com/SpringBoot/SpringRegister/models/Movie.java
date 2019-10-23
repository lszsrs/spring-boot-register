package com.SpringBoot.SpringRegister.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "movies")
public class Movie {
	@Id
	@GeneratedValue
	private Long id;
	private String name; 
	private int duration; 
	private String releaseDate;
	private String awardIndication;
	
	@ManyToOne
	@JoinColumn(name = "director_id")
	private Director director; 	
	
	public Movie() {}
	
	public Movie(String name, int duration, String releaseDate, String awardIndication, Director director) {
		super();
		this.name = name;
		this.duration = duration;
		this.releaseDate = releaseDate;
		this.awardIndication = awardIndication;
		this.director = director;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public String getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}
	public String getAwardIndication() {
		return awardIndication;
	}
	public void setAwardIndication(String awardIndication) {
		this.awardIndication = awardIndication;
	}
	public Director getDirector() {
		return director;
	}
	public void setDirector(Director director) {
		this.director = director;
	} 
	
	
	
	
}
