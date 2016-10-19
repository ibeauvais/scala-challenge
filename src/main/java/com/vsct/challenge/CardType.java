package com.vsct.challenge;


public enum CardType {

    NO_CARD("NO_CARD"),
    SENIO("SENIO"),
    YOUNG("YOUNG");

    public final String cardLabel;

    CardType(String cardLabel) {
        this.cardLabel = cardLabel;
    }

    public static CardType fromLabel(String card) {
        try {
            return valueOf(card);
        } catch (IllegalArgumentException e) {
            return NO_CARD;
        }
    }
}
