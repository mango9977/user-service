package ru.selfproduction.userservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import ru.selfproduction.userservice.model.PlayerEntity;

public interface PlayerRepository extends MongoRepository<PlayerEntity,String> {

}
