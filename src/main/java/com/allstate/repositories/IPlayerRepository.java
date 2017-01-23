package com.allstate.repositories;

import com.allstate.entities.Player;
import org.springframework.data.repository.CrudRepository;

public interface IPlayerRepository  extends CrudRepository<Player, Integer>{

}
