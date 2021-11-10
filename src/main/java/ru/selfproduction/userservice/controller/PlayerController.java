package ru.selfproduction.userservice.controller;

import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import ru.selfproduction.userservice.model.LikeUserObject;
import ru.selfproduction.userservice.model.PlayerEntity;
import ru.selfproduction.userservice.model.dto.UserLikesDto;
import ru.selfproduction.userservice.service.LikeService;
import ru.selfproduction.userservice.service.PlayerService;

import java.util.List;

@RestController
@Validated
@RequestMapping(value = "/v1/user-data")
public class PlayerController {

    @Setter(onMethod = @__({@Autowired}))
    LikeService likeService;
    @Setter(onMethod = @__({@Autowired}))
    PlayerService playerService;

    @PutMapping(path = "/likes/{targetUserId}")
    HttpStatus setPlayerLikes(
            @RequestBody LikeUserObject likeAction
    ) {
        HttpStatus status;
        try {
            likeService.like(likeAction);
            status = HttpStatus.OK;
        } catch (Exception e) {
            status = HttpStatus.INTERNAL_SERVER_ERROR;
        }
        return status;
    }

    @GetMapping(path = "/likes/{userId}")
    ResponseEntity<UserLikesDto> getPlayerLikes(
                  @PathVariable String userId
    ) {
        try {
            return ResponseEntity.ok(likeService.getLikes(userId));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }

    }

    @PostMapping(path = "/player")
    ResponseEntity<PlayerEntity> createPlayer(@RequestBody PlayerEntity player) {
        PlayerEntity playerEntity;
        try {
            playerEntity = playerService.createPlayer(player).get();
            return ResponseEntity.ok(playerEntity);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
    }

    @GetMapping(path = "/player/all")
    ResponseEntity<List<PlayerEntity>> getAllUsers() {
        return ResponseEntity.ok(playerService.getAllPlayer());
    }
}
