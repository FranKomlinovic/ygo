package hr.brocom.ygo.jpa.jpaimpl;

import hr.brocom.ygo.jpa.entity.CardEntity;
import hr.brocom.ygo.jpa.entity.UserCardEntity;
import hr.brocom.ygo.jpa.entity.UserEntity;
import hr.brocom.ygo.jpa.repository.CardRepository;
import hr.brocom.ygo.jpa.repository.UserCardRepository;
import hr.brocom.ygo.jpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.NoSuchElementException;

@Repository
public class UserCardJpaImpl {

    @Autowired
    UserCardRepository userCardRepository;

    @Autowired
    UserRepository userRepository;

    @Autowired
    CardRepository cardRepository;

    public void addCardToUser(String userMail, String cardCode, Integer quantity) {
        UserCardEntity userCardEntity = new UserCardEntity();
        userCardEntity.setUser(findUserByMail(userMail));
        userCardEntity.setCard(findCardByCode(cardCode));
        userCardEntity.setQuantity(quantity);
        userCardRepository.saveAndFlush(userCardEntity);
    }

    private UserEntity findUserByMail(String userMail) {
        return userRepository.findByMail(userMail).orElseThrow(NoSuchElementException::new);
    }

    private CardEntity findCardByCode(String cardCode) {
        return cardRepository.findByCode(cardCode).orElseThrow(NoSuchElementException::new);
    }
}
