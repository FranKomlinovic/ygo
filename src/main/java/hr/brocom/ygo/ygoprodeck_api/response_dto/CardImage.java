package hr.brocom.ygo.ygoprodeck_api.response_dto;

import com.google.gson.annotations.SerializedName;

public class CardImage {
    @SerializedName("id")
    private Integer id;
    @SerializedName("image_url")
    private String imageUrl;
    @SerializedName("image_url_small")
    private String imageUrlSmall;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getImageUrlSmall() {
        return imageUrlSmall;
    }

    public void setImageUrlSmall(String imageUrlSmall) {
        this.imageUrlSmall = imageUrlSmall;
    }
}
