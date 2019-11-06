package hr.brocom.ygo.jpa.repository;

import hr.brocom.ygo.jpa.entity.UserCardEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserCardRepository extends JpaRepository<UserCardEntity, Integer> {
}
