package hr.brocom.ygo.service;

import hr.brocom.ygo.jpa.jpaimpl.UserJpaImpl;
import hr.brocom.ygo.model.UserDto;
import hr.brocom.ygo.util.MD5Hashing;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserJpaImpl userJpa;

    public void saveUser(UserDto user) {
        user.setPassword(MD5Hashing.hashPassword(user.getPassword()));
        userJpa.saveUser(user);
    }

    public void changeUserPassword() {

    }

    public void addCardToUser() {

    }

    public void updateQuantity() {

    }
}
