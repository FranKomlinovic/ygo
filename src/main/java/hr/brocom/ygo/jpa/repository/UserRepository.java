package hr.brocom.ygo.jpa.repository;

import hr.brocom.ygo.jpa.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {
}
