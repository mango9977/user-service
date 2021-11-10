package ru.selfproduction.userservice.service;

import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.selfproduction.userservice.model.PlayerEntity;
import ru.selfproduction.userservice.repository.PlayerRepository;

import java.util.List;
import java.util.Optional;

@Service
public class PlayerServiceImpl implements PlayerService{
    @Setter(onMethod = @__({@Autowired}))
    PlayerRepository playerRepository;

    @Override
    public Optional<PlayerEntity> createPlayer(PlayerEntity player) {
      return Optional.ofNullable(playerRepository.save(player));
    }

    @Override
    public List<PlayerEntity> getAllPlayer() {
        return  playerRepository.findAll() ;
    }
}
