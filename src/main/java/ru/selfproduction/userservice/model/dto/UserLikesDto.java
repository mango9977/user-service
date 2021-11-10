package ru.selfproduction.userservice.model.dto;

import lombok.Data;

import java.util.Map;

@Data
public class UserLikesDto {
    String userId;
    String nickName;
    Map<String, Integer> likesMap; // key - playerId, value - likesCount
}
