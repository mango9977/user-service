package ru.selfproduction.userservice.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "users_likes")
public class LikeEntity {

    @Id
    private String id;
    private int likeCount;
    private UserEntity userEntity;
}
