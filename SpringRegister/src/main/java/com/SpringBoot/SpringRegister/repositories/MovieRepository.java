package com.SpringBoot.SpringRegister.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SpringBoot.SpringRegister.models.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long>{

}
