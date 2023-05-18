package com.intensivojavaspring.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intensivojavaspring.dslist.dto.GameMinDTO;
import com.intensivojavaspring.dslist.entities.Game;
import com.intensivojavaspring.dslist.repositories.GameRepository;

@Service //registra essa classe no sistema
public class GameService {
	
	@Autowired
	private GameRepository gameRepository; //ingeção do game repository no game service
	
	public List<GameMinDTO> findAll(){
		List<Game> result = gameRepository.findAll();
		//a variavel result do tipo list<game> recebe a lista de jogos do baco de dados
		List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
		return dto;
	}
	
}
