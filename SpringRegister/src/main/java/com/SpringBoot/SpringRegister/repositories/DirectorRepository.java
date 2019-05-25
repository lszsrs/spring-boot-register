package com.SpringBoot.SpringRegister.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SpringBoot.SpringRegister.models.Director;

@Repository
public interface DirectorRepository extends JpaRepository<Director, Long> {

}
