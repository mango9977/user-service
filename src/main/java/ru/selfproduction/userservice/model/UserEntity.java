package ru.selfproduction.userservice.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document(collection = "users")
public class UserEntity {

    @Id
    private String id;
    @Indexed
    private String login;
    private String password;
    @Indexed
    private String nickName;

    private List<LikeEntity> likeList;

}
