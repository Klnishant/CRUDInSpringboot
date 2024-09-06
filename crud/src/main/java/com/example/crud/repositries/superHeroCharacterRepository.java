package com.example.crud.repositries;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.crud.models.characters;

@Repository
public interface superHeroCharacterRepository extends JpaRepository<characters,Integer> {

}
