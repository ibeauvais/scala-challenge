package com.vsct.challenge;

import java.util.ArrayList;
import java.util.List;

import static com.vsct.challenge.CardType.*;
import static java.util.Collections.emptyList;
import static java.util.Collections.singletonList;

public class CardTransformer {

    public CardTransformer() {
    }

    public List<InputProposal> apply(InputProposal input) {

        List<String> cards = new ArrayList();
        for (Segment segment : input.getSegments()) {
            for (Quotation quotation : segment.getQuotes()) {
                for (String card : quotation.getTravelAdvantages()) {
                    if (card == null) {
                        cards.add(NO_CARD.cardLabel);
                    } else {
                        cards.add(card);
                    }
                }
            }
        }

        boolean isEligible = true;

        for (String card : cards) {
            if (!isEligible(card)) {
                isEligible = false;
                break;
            }
        }

        if (isEligible) {
            String card = cards.isEmpty() ? NO_CARD.cardLabel : cards.stream()
                    .reduce((card1, card2) -> NO_CARD.cardLabel.equals(card1) ? card2 : card1).get();
            transform(input, card, NO_CARD.cardLabel.equals(card) ? input.getPassengers().get(0).getAge() : -1);
            return singletonList(input);
        }

        return emptyList();
    }

    private boolean isEligible(String card) {
        return isEligibleCard(card) || NO_CARD.cardLabel.equals(card);
    }

    private boolean isEligibleCard(String card) {
        return SENIO.cardLabel.equals(card) ||
                YOUNG.cardLabel.equals(card);
    }

    private InputProposal transform(InputProposal input, String card, int age) {
        input.getPassengers().get(0).getCards().clear();
        input.getPassengers().get(0).getCards().add(card);
        input.getPassengers().get(0).setAge(age);
        return input;
    }
}
