package hr.brocom.ygo.ygoprodeck_api.response_dto;

import com.google.gson.annotations.SerializedName;

import java.math.BigDecimal;

public class CardEdition {
    @SerializedName("set_name")
    private String setName;
    @SerializedName("set_code")
    private String setCode;
    @SerializedName("set_rarity")
    private String setRarity;
    @SerializedName("set_price")
    private BigDecimal setPrice;

    public String getSetName() {
        return setName;
    }

    public void setSetName(String setName) {
        this.setName = setName;
    }

    public String getSetCode() {
        return setCode;
    }

    public void setSetCode(String setCode) {
        this.setCode = setCode;
    }

    public String getSetRarity() {
        return setRarity;
    }

    public void setSetRarity(String setRarity) {
        this.setRarity = setRarity;
    }

    public BigDecimal getSetPrice() {
        return setPrice;
    }

    public void setSetPrice(BigDecimal setPrice) {
        this.setPrice = setPrice;
    }

    @Override
    public String toString() {
        return "CardEdition{" +
                "setName='" + setName + '\'' +
                ", setCode='" + setCode + '\'' +
                ", setRarity='" + setRarity + '\'' +
                ", setPrice=" + setPrice +
                '}';
    }
}
