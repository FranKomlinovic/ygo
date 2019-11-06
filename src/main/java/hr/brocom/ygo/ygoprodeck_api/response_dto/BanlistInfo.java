package hr.brocom.ygo.ygoprodeck_api.response_dto;

import com.google.gson.annotations.SerializedName;

public class BanlistInfo {
    @SerializedName("ban_goat")
    private String banGoat;
    @SerializedName("ban_tcg")
    private String banTcg;
    @SerializedName("ban_ocg")
    private String banOcg;

    public String getBanGoat() {
        return banGoat;
    }

    public void setBanGoat(String banGoat) {
        this.banGoat = banGoat;
    }

    public String getBanTcg() {
        return banTcg;
    }

    public void setBanTcg(String banTcg) {
        this.banTcg = banTcg;
    }

    public String getBanOcg() {
        return banOcg;
    }

    public void setBanOcg(String banOcg) {
        this.banOcg = banOcg;
    }
}
