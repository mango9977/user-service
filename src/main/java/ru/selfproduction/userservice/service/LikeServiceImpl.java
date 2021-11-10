package ru.selfproduction.userservice.service;

import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.selfproduction.userservice.model.LikeEntity;
import ru.selfproduction.userservice.model.LikeUserObject;
import ru.selfproduction.userservice.model.PlayerEntity;
import ru.selfproduction.userservice.model.dto.UserLikesDto;
import ru.selfproduction.userservice.repository.PlayerRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class LikeServiceImpl implements LikeService {

    @Setter(onMethod = @__({@Autowired}))
    PlayerRepository playerRepository;

    @Override
    public void like(LikeUserObject likeUserObject) {
        if (Objects.isNull(likeUserObject)) return;
        String targetPlayerId = likeUserObject.getTargetUserId();
        String currentPlayerId = likeUserObject.getCurrentUserId();
        PlayerEntity player = new PlayerEntity();
        List<LikeEntity> likeList;
        LikeEntity le;
        Optional<PlayerEntity> optional = playerRepository.findById(targetPlayerId);
        if (!optional.isPresent()) return;
        PlayerEntity pe = optional.get();
        if (Objects.isNull(pe.getLikeList()) || pe.getLikeList().isEmpty()) {
            likeList = new ArrayList<>();
            le = new LikeEntity(currentPlayerId, 1);
            likeList.add(le);
            //TODO сделать сохранение объекта
            return;
        }
        for (int i = 0; i < pe.getLikeList().size(); i++) {
            //TODO сделать обработку по существующему списку лайков от игроков и записать в БД к нужному игроку +1
        }
    }


    @Override
    public UserLikesDto getLikes(String playerId) {
        UserLikesDto userLikesDto=new UserLikesDto();
        //TODO запрос на получение всего массива лайков по игрокам
        return  userLikesDto;
    }
}
