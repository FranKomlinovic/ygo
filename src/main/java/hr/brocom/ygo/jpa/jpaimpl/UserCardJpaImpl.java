package hr.brocom.ygo.jpa.jpaimpl;

import hr.brocom.ygo.jpa.entity.UserCardEntity;
import hr.brocom.ygo.jpa.repository.UserCardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserCardJpaImpl {

    @Autowired
    UserCardRepository userCardRepository;

    public void addCardToUser(String userMail, String cardCode, Integer quantity){
        UserCardEntity userCardEntity = new UserCardEntity();
//        userCardEntity.setUser();
//        userCardEntity.setCard();
//        userCardEntity.setQuantity();


    }
}
