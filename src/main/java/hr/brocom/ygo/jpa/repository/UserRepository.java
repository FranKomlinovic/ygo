package hr.brocom.ygo.jpa.repository;

import hr.brocom.ygo.jpa.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {
    Optional<UserEntity> findByMail(String mail);
}
