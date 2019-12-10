package hr.brocom.ygo.jpa.repository;

import hr.brocom.ygo.jpa.entity.CardEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CardRepository extends JpaRepository<CardEntity, Integer> {
    CardEntity findByNameAndCode(String name, String code);
    Optional<CardEntity> findByCode(String code);
    Optional<List<CardEntity>> findAllByArchetype(String archetype);
    Optional<List<CardEntity>> findAllByEdition(String edition);

}
