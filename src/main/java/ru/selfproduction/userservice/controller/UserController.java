package ru.selfproduction.userservice.controller;

import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import ru.selfproduction.userservice.service.LikeService;

@RestController
public class UserController {

    @Setter(onMethod = @__({@Autowired}))
    LikeService likeService;


}
