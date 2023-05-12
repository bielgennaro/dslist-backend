package com.bielgennaro.dslist.controllers;

import java.util.List;

import com.bielgennaro.dslist.dto.GameDTO;
import com.bielgennaro.dslist.dto.GameMinDTO;
import com.bielgennaro.dslist.entities.Game;
import com.bielgennaro.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping(value = "/{gameId}")
    public GameDTO findById(@PathVariable Long gameId){
        GameDTO result = gameService.findById(gameId);

        return result;
    }

    @GetMapping
    public List<GameMinDTO> findAll(){
        List<GameMinDTO> result = gameService.findAll();

        return result;
    }
}
