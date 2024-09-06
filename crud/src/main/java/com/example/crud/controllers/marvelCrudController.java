package com.example.crud.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.crud.services.*;
import com.example.crud.models.characters;

@RestController
public class marvelCrudController {
	
	@Autowired
	crudService crudService;
	
	@PostMapping(path = "create")
	public void superHero(@RequestBody characters superhero) {
		crudService.createSuperHero(superhero);
	}
	
	@GetMapping(path="get")
	public characters getSuperHero(@RequestParam (name="id") int val) {
		return crudService.getSuperHero(val);
	}
	
	@PutMapping(path="update")
	public void updateSuperHero(@RequestBody characters superHero, @RequestParam(name="q") int id) {
		crudService.updateSuperHero(superHero,id);
	}
	
	@DeleteMapping("delete")
	public void deleteSuperHero(@RequestParam(name="ids") int id) {
		crudService.deleteSuperHero(id);
	}
}
