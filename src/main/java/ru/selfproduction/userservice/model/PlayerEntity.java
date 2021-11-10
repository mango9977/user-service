package ru.selfproduction.userservice.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Data
@Document(collection = "users")
@NoArgsConstructor
@JsonIgnoreProperties
public class PlayerEntity {

    @Id
    private String id;
    @Indexed
    private String login;
    @Indexed
    private String email;
    private String passHash;
    @Indexed
    private String nickName;

    private List<LikeEntity> likeList=new ArrayList<>();



}
