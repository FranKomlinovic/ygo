package hr.brocom.ygo.jpa.jpaimpl;

import hr.brocom.ygo.jpa.entity.CardEntity;
import hr.brocom.ygo.jpa.entity.ImageEntity;
import hr.brocom.ygo.jpa.repository.CardRepository;
import hr.brocom.ygo.jpa.repository.ImageRepository;
import hr.brocom.ygo.ygoprodeck_api.response_dto.CardEdition;
import hr.brocom.ygo.ygoprodeck_api.response_dto.CardImage;
import hr.brocom.ygo.ygoprodeck_api.response_dto.CardInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CardJpaImpl {

    @Autowired
    CardRepository cardRepository;

    @Autowired
    ImageRepository imageRepository;

    int i = 0;

    @Transactional
    public void saveAllCards(List<CardInfo> cardList) {
        cardList.forEach(cardInfo -> saveAllCardsToDatabase(cardInfo));
    }

    private void saveAllCardsToDatabase(CardInfo card) {
        //Do not add OCG Cards
        if (card.getCardEditions() != null) {
            // Iterate trough all editions, if one card is in more than one edition
            for (CardEdition cardEdition : card.getCardEditions()) {
                // Look in DB if card is present
                CardEntity db = cardRepository.findByNameAndCode(card.getName(), cardEdition.getSetCode());
                CardEntity entityFromDatabase = new CardEntity();
                // If exists in DB, update instead of create new
                if (db != null) {
                    entityFromDatabase = cardRepository.findById(db.getId()).orElse(null);
                }
                entityFromDatabase.setCardId(card.getId());
                entityFromDatabase.setName(card.getName());
                entityFromDatabase.setType(card.getType());
                entityFromDatabase.setDescription(card.getDesc());
                entityFromDatabase.setRace(card.getRace());
                entityFromDatabase.setArchetype(card.getArchetype());
                if (card.getBanlistInfo() == null) {
                    entityFromDatabase.setBanlist(null);
                } else {
                    entityFromDatabase.setBanlist(card.getBanlistInfo().getBanTcg());
                }
                entityFromDatabase.setAtk(card.getAtk());
                entityFromDatabase.setDef(card.getDef());
                entityFromDatabase.setLevel(card.getLevel());
                entityFromDatabase.setAttribute(card.getAttribute());
                entityFromDatabase.setScale(card.getScale());
                entityFromDatabase.setLinkval(card.getLinkval());
                entityFromDatabase.setCode(cardEdition.getSetCode());
                entityFromDatabase.setEdition(cardEdition.getSetName());
                entityFromDatabase.setPrice(cardEdition.getSetPrice());
                entityFromDatabase.setRarity(cardEdition.getSetRarity());

                cardRepository.saveAndFlush(entityFromDatabase);
                saveImages(card.getCardImages(), entityFromDatabase);
            }
        }

    }

    private void saveImages(List<CardImage> cardImageList, CardEntity card) {
        List<ImageEntity> imageEntityList = new ArrayList<>();
        for (CardImage image : cardImageList) {
            ImageEntity imageEntity = new ImageEntity();
            imageEntity.setImage(image.getImageUrl());
            imageEntity.setImageSmall(image.getImageUrlSmall());
            imageEntity.setCard(card);
            System.out.println(i);
            imageRepository.saveAndFlush(imageEntity);
            i++;
        }
    }

}
