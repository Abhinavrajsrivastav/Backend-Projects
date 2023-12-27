package com.example.abhinav.springCrud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.abhinav.springCrud.models.Characters;
import com.example.abhinav.springCrud.repositories.SuperHeroCharacterRepository;

@Service
public class CrudServise {

	@Autowired
	SuperHeroCharacterRepository superHeroCharacterRepository;
	
	public void createSuperHero(Characters character) {
		// TODO Auto-generated method stub
		superHeroCharacterRepository.save(character);

	}
	
	public Characters readSuperHeroById(int val) {
		return superHeroCharacterRepository.findById(val).get();
	}
	
	public void superHeroUpdate(Characters superHero,int id) {
		Characters superHeroToBeUpdated = readSuperHeroById(id);
		superHeroToBeUpdated.setName(superHero.getName());
		superHeroToBeUpdated.setHumenName(superHero.getHumenName());
		superHeroCharacterRepository.save(superHeroToBeUpdated);
	}
	
	public void superHeroDelete(int id) {
		Characters superHeroToBeDeleted = readSuperHeroById(id);
		superHeroCharacterRepository.deleteById(id);
	}
}
