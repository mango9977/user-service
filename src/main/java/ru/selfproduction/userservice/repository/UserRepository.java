package ru.selfproduction.userservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import ru.selfproduction.userservice.model.UserEntity;

public interface UserRepository extends MongoRepository<UserEntity,Long> {

}
