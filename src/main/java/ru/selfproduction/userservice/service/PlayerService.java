package ru.selfproduction.userservice.service;

import ru.selfproduction.userservice.model.PlayerEntity;

import java.util.List;
import java.util.Optional;

public interface PlayerService {
    Optional<PlayerEntity> createPlayer(PlayerEntity player);

    List<PlayerEntity> getAllPlayer();
}
