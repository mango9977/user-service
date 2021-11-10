package ru.selfproduction.userservice.service;

import ru.selfproduction.userservice.model.LikeUserObject;
import ru.selfproduction.userservice.model.dto.UserLikesDto;

public interface LikeService {
        void like(LikeUserObject likeUserObj);
        UserLikesDto getLikes(String playerId);
}
