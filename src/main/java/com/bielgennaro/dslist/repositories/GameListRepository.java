package com.bielgennaro.dslist.repositories;

import com.bielgennaro.dslist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {}
