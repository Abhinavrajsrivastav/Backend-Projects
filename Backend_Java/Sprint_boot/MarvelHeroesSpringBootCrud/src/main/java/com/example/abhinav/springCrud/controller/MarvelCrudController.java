package com.example.abhinav.springCrud.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.abhinav.springCrud.models.Characters;
import com.example.abhinav.springCrud.service.CrudServise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.abhinav.springCrud.service.CrudServise;


@RestController
public class MarvelCrudController {

	@Autowired
	CrudServise crudServise;
	
	@PostMapping(path = "create")
	public void createSuperHero(@RequestBody Characters superHero) {
		
     crudServise.createSuperHero(superHero);
		
	}
	
	@GetMapping("read")
	public Characters readSuperHeroById(@RequestParam(name="id") int val) {
		return crudServise.readSuperHeroById(val);
	}
	
	@PutMapping("update")
	public void superHeroUpdate(@RequestBody Characters superHero,@RequestParam(name="id") int id) {
		// TODO Auto-generated method stub
		
          crudServise.superHeroUpdate(superHero, id);
	}
	
	
	@DeleteMapping("delete")
	public void deleteSuperHero(@RequestParam(name="id") int id) {
		crudServise.superHeroDelete(id);
	}

}
