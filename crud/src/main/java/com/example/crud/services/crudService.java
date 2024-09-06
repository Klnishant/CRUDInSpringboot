package com.example.crud.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.crud.models.characters;
import com.example.crud.repositries.superHeroCharacterRepository;

@Service
public class crudService {
	
	@Autowired
	superHeroCharacterRepository superHeroCharacterRepository;
	
	public void createSuperHero(characters character) {
		superHeroCharacterRepository.save(character);
	}

	public characters getSuperHero(int val) {
		return superHeroCharacterRepository.findById(val).get();
		
	}

	public void updateSuperHero(characters superHero,int id) {
		characters superHeroToBeUpdated = getSuperHero(id);
		superHeroToBeUpdated.setHuman_name(superHero.getHuman_name());
		superHeroCharacterRepository.save(superHeroToBeUpdated);
		
	}

	public void deleteSuperHero(int id) {
		superHeroCharacterRepository.deleteById(id);
		
	}

}
