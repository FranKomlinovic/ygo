package hr.brocom.ygo.ygoprodeck_api.response_dto;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class CardInfo {
    @SerializedName("id")
    private Integer id;
    @SerializedName("name")
    private String name;
    @SerializedName("type")
    private String type;
    @SerializedName("desc")
    private String desc;
    @SerializedName("race")
    private String race;
    @SerializedName("archetype")
    private String archetype;
    @SerializedName("atk")
    private Integer atk;
    @SerializedName("def")
    private Integer def;
    @SerializedName("level")
    private Integer level;
    @SerializedName("attribute")
    private String attribute;
    @SerializedName("scale")
    private Integer scale;
    @SerializedName("linkval")
    private Integer linkval;
    @SerializedName("card_sets")
    private List<CardEdition> cardEditions;
    @SerializedName("banlist_info")
    private BanlistInfo banlistInfo;
    @SerializedName("card_images")
    private List<CardImage> cardImages = null;
    @SerializedName("card_prices")
    private CardPrices cardPrices;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getArchetype() {
        return archetype;
    }

    public void setArchetype(String archetype) {
        this.archetype = archetype;
    }

    public List<CardEdition> getCardEditions() {
        return cardEditions;
    }

    public void setCardEditions(List<CardEdition> cardEditions) {
        this.cardEditions = cardEditions;
    }

    public BanlistInfo getBanlistInfo() {
        return banlistInfo;
    }

    public void setBanlistInfo(BanlistInfo banlistInfo) {
        this.banlistInfo = banlistInfo;
    }

    public List<CardImage> getCardImages() {
        return cardImages;
    }

    public void setCardImages(List<CardImage> cardImages) {
        this.cardImages = cardImages;
    }

    public CardPrices getCardPrices() {
        return cardPrices;
    }

    public void setCardPrices(CardPrices cardPrices) {
        this.cardPrices = cardPrices;
    }

    public Integer getAtk() {
        return atk;
    }

    public void setAtk(Integer atk) {
        this.atk = atk;
    }

    public Integer getDef() {
        return def;
    }

    public void setDef(Integer def) {
        this.def = def;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public Integer getScale() {
        return scale;
    }

    public void setScale(Integer scale) {
        this.scale = scale;
    }

    public Integer getLinkval() {
        return linkval;
    }

    public void setLinkval(Integer linkval) {
        this.linkval = linkval;
    }

    @Override
    public String toString() {
        return "CardInfo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", desc='" + desc + '\'' +
                ", race='" + race + '\'' +
                ", archetype='" + archetype + '\'' +
                ", atk=" + atk +
                ", def=" + def +
                ", level=" + level +
                ", attribute='" + attribute + '\'' +
                ", scale=" + scale +
                ", linkval=" + linkval +
                ", cardEditions=" + cardEditions +
                ", banlistInfo=" + banlistInfo +
                ", cardImages=" + cardImages +
                ", cardPrices=" + cardPrices +
                '}';
    }
}
