package Tasks.lesson16.entertaining;

import java.util.HashMap;

public class Card {
    private HashMap<Suits, Ranks> card = new HashMap<>();

    public Card(Suits suit, Ranks rank) {

        card.put(suit, rank);
    }

    public HashMap<Suits, Ranks> getCard() {
        return card;
    }

    public void setCard(HashMap<Suits, Ranks> card) {
        this.card = card;
    }

}
