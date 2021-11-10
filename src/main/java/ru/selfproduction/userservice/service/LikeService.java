package ru.selfproduction.userservice.service;

import ru.selfproduction.userservice.model.LikeUserObject;

public interface LikeService {
        void like(LikeUserObject likeUserObj);
        int getLikes(String playerId);
}
