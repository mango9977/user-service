package ru.selfproduction.userservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Reference;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "users_likes")
@AllArgsConstructor
public class LikeEntity {
    @Id
    private String userId;
    private int likeCount;
}
