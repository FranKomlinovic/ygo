package hr.brocom.ygo.model;

import hr.brocom.ygo.jpa.entity.CardEntity;

import java.util.List;

public class UserDto {
    private String nickname;
    private String mail;
    private String password;
    private List<CardEntity> cards;

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<CardEntity> getCards() {
        return cards;
    }

    public void setCards(List<CardEntity> cards) {
        this.cards = cards;
    }

    @Override
    public String toString() {
        return "UserDto{" +
                "nickname='" + nickname + '\'' +
                ", mail='" + mail + '\'' +
                ", password='" + password + '\'' +
                ", cards=" + cards +
                '}';
    }
}
