package hr.brocom.ygo.ygoprodeck_api;

import hr.brocom.ygo.jpa.jpaimpl.CardJpaImpl;
import hr.brocom.ygo.jpa.jpaimpl.UserJpaImpl;
import hr.brocom.ygo.model.UserDto;
import hr.brocom.ygo.service.UserService;
import hr.brocom.ygo.ygoprodeck_api.response_dto.CardInfo;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@RunWith(SpringRunner.class)
@SpringBootTest
class YgoProDeckApiConnectionTest {

    @Autowired
    YgoProDeckApiConnection ygoProDeckApiConnection;

    @Autowired
    CardJpaImpl cardJpa;

    @Autowired
    UserService userService;

    @Test
    public void saveAllCardsToDatabase() {
        List<CardInfo> cardsFromApi = ygoProDeckApiConnection.getCardsFromApi();
        List<CardInfo> collect = cardsFromApi.stream().limit(100).collect(Collectors.toList());
        cardJpa.saveAllCards(collect);
    }

    @Test
    @Transactional
    public void saveUser() {
        UserDto user = new UserDto();
        user.setNickname("CroSlave");
        user.setMail("fran.komlinovic@gmail.com");
        user.setPassword("password");
        userService.saveUser(user);


    }
}
