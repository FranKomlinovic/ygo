package hr.brocom.ygo.jpa.jpaimpl;

import hr.brocom.ygo.jpa.entity.UserEntity;
import hr.brocom.ygo.jpa.repository.UserRepository;
import hr.brocom.ygo.model.UserDto;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserJpaImpl {

    @Autowired
    UserRepository userRepository;

    @Autowired
    ModelMapper modelMapper;

    public void saveUser(UserDto user) {
        UserEntity userEntity = modelMapper.map(user, UserEntity.class);
        userRepository.save(userEntity);
    }
}
