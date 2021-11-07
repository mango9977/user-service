package ru.selfproduction.userservice.service;

public interface LikeService {
        void like(String playerId);
        long getLikes(String playerId);
}
