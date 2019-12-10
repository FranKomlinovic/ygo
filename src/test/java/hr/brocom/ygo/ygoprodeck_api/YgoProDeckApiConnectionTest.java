package hr.brocom.ygo.ygoprodeck_api;

import hr.brocom.ygo.jpa.jpaimpl.CardJpaImpl;
import hr.brocom.ygo.jpa.jpaimpl.UserCardJpaImpl;
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

    @Autowired
    UserCardJpaImpl userCardJpa;


    @Test
    public void saveAllCardsToDatabase() {
        List<CardInfo> cardsFromApi = ygoProDeckApiConnection.getCardsFromApi();
        List<CardInfo> collect = cardsFromApi.stream().limit(10).collect(Collectors.toList());
        cardJpa.saveAllCards(collect);

        UserDto user = new UserDto();
        user.setNickname("CroSlave");
        user.setMail("fran.komlinovic@gmail.com");
        user.setPassword("password");
        userService.saveUser(user);

        userCardJpa.addCardToUser(user.getMail(), collect.get(3).getCardEditions().get(0).getSetCode(), 7 );
    }

    @Test
    public void findByCode(){
        String code = "SDCR-EN014";
        cardJpa.findByCode(code);
    }
    @Test
    @Transactional
    public void saveUser() {



    }
}
