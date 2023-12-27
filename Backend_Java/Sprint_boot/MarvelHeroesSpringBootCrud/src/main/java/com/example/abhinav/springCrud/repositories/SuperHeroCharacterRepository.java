package com.example.abhinav.springCrud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.abhinav.springCrud.models.Characters;

@Repository
public interface SuperHeroCharacterRepository extends JpaRepository<Characters, Integer>{
       
	
}
