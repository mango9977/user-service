package ru.selfproduction.userservice.model;

import lombok.Data;

@Data
public class LikeUserObject {
    String targetUserId;
    String currentUserId;
}
