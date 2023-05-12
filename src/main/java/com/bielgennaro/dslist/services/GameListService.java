package com.bielgennaro.dslist.services;

import com.bielgennaro.dslist.dto.GameDTO;
import com.bielgennaro.dslist.dto.GameListDTO;
import com.bielgennaro.dslist.dto.GameMinDTO;
import com.bielgennaro.dslist.entities.Game;
import com.bielgennaro.dslist.entities.GameList;
import com.bielgennaro.dslist.repositories.GameListRepository;
import com.bielgennaro.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {
        List<GameList> result = gameListRepository.findAll();
        List<GameListDTO> dto = result.stream().map(x -> new GameListDTO(x)).toList();

        return dto;
    }
}
