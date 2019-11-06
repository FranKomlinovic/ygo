package hr.brocom.ygo.ygoprodeck_api;

import com.google.gson.Gson;
import hr.brocom.ygo.ygoprodeck_api.response_dto.CardInfo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class YgoProDeckApiConnection {

    @Value("${api.all.editions}")
    private String EDITION_ENDPOINT;
    @Value("${api.all.cards}")
    private String ALL_CARDS_ENDPOINT;

    public List<CardInfo> getCardsFromApi() {
        String json = ApiJsonConnection.jsonGetRequest(ALL_CARDS_ENDPOINT);
        Gson gson = new Gson();
        CardInfo[] set = gson.fromJson(json, CardInfo[].class);
        List<CardInfo> cardInfos = Arrays.asList(set);
        return cardInfos;
    }
}
