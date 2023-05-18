package com.intensivojavaspring.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.intensivojavaspring.dslist.entities.Game;

public interface GameRepository  extends JpaRepository<Game, Long>{
	//esta interface ira se comunicar com o banco de dados = acessa o banco de dados
}
