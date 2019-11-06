package hr.brocom.ygo.jpa.entity;

import javax.persistence.*;
import java.awt.*;
import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "card")
public class CardEntity {
    private Integer id;
    private Integer cardId;
    private String name;
    private String type;
    private String description;
    private String race;
    private String archetype;
    private String banlist;
    private Integer atk;
    private Integer def;
    private Integer level;
    private String attribute;
    private Integer scale;
    private Integer linkval;
    private String edition;
    private String rarity;
    private BigDecimal price;
    private String code;
    private List<ImageEntity> imageEntities;
    private List<UserCardEntity> userCardEntities;

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
    @Column(name = "card_id")
    public Integer getCardId() {
        return cardId;
    }

    public void setCardId(Integer cardId) {
        this.cardId = cardId;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Lob
    @Column(name = "description", columnDefinition = "MEDIUMTEXT")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "race")
    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    @Basic
    @Column(name = "archetype")
    public String getArchetype() {
        return archetype;
    }

    public void setArchetype(String archetype) {
        this.archetype = archetype;
    }

    @Basic
    @Column(name = "banlist")
    public String getBanlist() {
        return banlist;
    }

    public void setBanlist(String banlist) {
        this.banlist = banlist;
    }

    @Basic
    @Column(name = "atk")
    public Integer getAtk() {
        return atk;
    }

    public void setAtk(Integer atk) {
        this.atk = atk;
    }

    @Basic
    @Column(name = "def")
    public Integer getDef() {
        return def;
    }

    public void setDef(Integer def) {
        this.def = def;
    }

    @Basic
    @Column(name = "level")
    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    @Basic
    @Column(name = "attribute")
    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    @Basic
    @Column(name = "scale")
    public Integer getScale() {
        return scale;
    }

    public void setScale(Integer scale) {
        this.scale = scale;
    }

    @Basic
    @Column(name = "linkval")
    public Integer getLinkval() {
        return linkval;
    }

    public void setLinkval(Integer linkval) {
        this.linkval = linkval;
    }

    @Basic
    @Column(name = "edition")
    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    @Basic
    @Column(name = "rarity")
    public String getRarity() {
        return rarity;
    }

    public void setRarity(String rarity) {
        this.rarity = rarity;
    }

    @Basic
    @Column(name = "price")
    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Basic
    @Column(name = "code")
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @OneToMany(mappedBy="card")
    public List<ImageEntity> getImageEntities() {
        return imageEntities;
    }

    public void setImageEntities(List<ImageEntity> imageEntities) {
        this.imageEntities = imageEntities;
    }

    @OneToMany(mappedBy="card")
    public List<UserCardEntity> getUserCardEntities() {
        return userCardEntities;
    }

    public void setUserCardEntities(List<UserCardEntity> userCardEntities) {
        this.userCardEntities = userCardEntities;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CardEntity entity = (CardEntity) o;
        return Objects.equals(id, entity.id) &&
                Objects.equals(cardId, entity.cardId) &&
                Objects.equals(name, entity.name) &&
                Objects.equals(type, entity.type) &&
                Objects.equals(description, entity.description) &&
                Objects.equals(race, entity.race) &&
                Objects.equals(archetype, entity.archetype) &&
                Objects.equals(banlist, entity.banlist) &&
                Objects.equals(atk, entity.atk) &&
                Objects.equals(def, entity.def) &&
                Objects.equals(level, entity.level) &&
                Objects.equals(attribute, entity.attribute) &&
                Objects.equals(scale, entity.scale) &&
                Objects.equals(linkval, entity.linkval) &&
                Objects.equals(edition, entity.edition) &&
                Objects.equals(rarity, entity.rarity) &&
                Objects.equals(price, entity.price) &&
                Objects.equals(code, entity.code) &&
                Objects.equals(imageEntities, entity.imageEntities) &&
                Objects.equals(userCardEntities, entity.userCardEntities);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, cardId, name, type, description, race, archetype, banlist, atk, def, level, attribute, scale, linkval, edition, rarity, price, code, imageEntities, userCardEntities);
    }
}
