package com.Analyzer.MTGAnalyzer;

import java.lang.reflect.Array;
import java.util.UUID;

public class Card {

    // Fields for finding the card in scryfall
    UUID scryfallId;
    Integer tcgplayerId;
    Integer tcgplayerEtchedId;
    String objectCard;

    // Fields information to the card
    Array allParts;
    Array cardFaces;
    Integer edhRecRank;
    Integer pennyRank;
    Boolean onReservedList;

    // Fields for the card face

    public UUID getScryfallId() {
        return scryfallId;
    }

    public void setScryfallId(UUID scryfallId) {
        this.scryfallId = scryfallId;
    }

    public Integer getTcgplayerId() {
        return tcgplayerId;
    }

    public void setTcgplayerId(Integer tcgplayerId) {
        this.tcgplayerId = tcgplayerId;
    }

    public Integer getTcgplayerEtchedId() {
        return tcgplayerEtchedId;
    }

    public void setTcgplayerEtchedId(Integer tcgplayerEtchedId) {
        this.tcgplayerEtchedId = tcgplayerEtchedId;
    }

    public String getObjectCard() {
        return objectCard;
    }

    public void setObjectCard(String objectCard) {
        this.objectCard = objectCard;
    }

    public Array getAllParts() {
        return allParts;
    }

    public void setAllParts(Array allParts) {
        this.allParts = allParts;
    }

    public Array getCardFaces() {
        return cardFaces;
    }

    public void setCardFaces(Array cardFaces) {
        this.cardFaces = cardFaces;
    }

    public Integer getEdhRecRank() {
        return edhRecRank;
    }

    public void setEdhRecRank(Integer edhRecRank) {
        this.edhRecRank = edhRecRank;
    }

    public Integer getPennyRank() {
        return pennyRank;
    }

    public void setPennyRank(Integer pennyRank) {
        this.pennyRank = pennyRank;
    }

    public Boolean getOnReservedList() {
        return onReservedList;
    }

    public void setOnReservedList(Boolean onReservedList) {
        this.onReservedList = onReservedList;
    }
}
