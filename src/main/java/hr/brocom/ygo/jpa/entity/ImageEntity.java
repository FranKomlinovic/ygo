package hr.brocom.ygo.jpa.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "image")
public class ImageEntity {
    private Integer id;
    private String image;
    private String imageSmall;
    private CardEntity card;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "image")
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Basic
    @Column(name = "image_small")
    public String getImageSmall() {
        return imageSmall;
    }

    public void setImageSmall(String imageSmall) {
        this.imageSmall = imageSmall;
    }


    @ManyToOne
    @JoinColumn(name = "card")
    public CardEntity getCard() {
        return card;
    }

    public void setCard(CardEntity card) {
        this.card = card;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ImageEntity that = (ImageEntity) o;
        return Objects.equals(image, that.image) &&
                Objects.equals(imageSmall, that.imageSmall) &&
                Objects.equals(card, that.card);
    }

    @Override
    public int hashCode() {
        return Objects.hash(image, imageSmall, card);
    }

}
