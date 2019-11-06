package hr.brocom.ygo.jpa.jpaimpl;

import hr.brocom.ygo.jpa.entity.ImageEntity;
import hr.brocom.ygo.jpa.repository.ImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ImageJpaImpl {

    @Autowired
    ImageRepository imageRepository;

    public void saveImages(){

    }
}
