package com.bielgennaro.dslist.controllers;

import java.util.List;

import com.bielgennaro.dslist.dto.GameMinDTO;
import com.bielgennaro.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameMinDTO> findAll(){
        List<GameMinDTO> result = gameService.findAll();

        return result;
    }
}
