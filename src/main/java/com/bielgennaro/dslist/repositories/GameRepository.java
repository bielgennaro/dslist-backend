package com.bielgennaro.dslist.repositories;

import com.bielgennaro.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long>{}
