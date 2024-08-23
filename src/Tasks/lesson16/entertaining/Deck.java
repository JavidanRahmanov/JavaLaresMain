package Tasks.lesson16.entertaining;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Deck {

    private List<Card> deck;

    Ranks[] ranks = Ranks.values();
    Suits[] suits = Suits.values();

    Random rnd = new Random();

    public Deck() {
        this.deck = new ArrayList<>();
    }

    public List<Card> getDeck() {
        return deck;
    }

    public void setDeck(List<Card> deck) {
        this.deck = deck;
    }

    public void shuffleDeck() {

        Collections.shuffle(deck);
    }

    public void populateCards(Deck deck){

        int randomRanksIndex = rnd.nextInt(ranks.length);
        int randomSuitsIndex = rnd.nextInt(suits.length);
        Card card = new Card(suits[randomSuitsIndex], ranks[randomRanksIndex]);
        deck.getDeck().add(card);
    }

    public int calculateTotalPoint() {

        int totalPoint = 0;

        for(Card card: deck){
            for(Ranks rank: card.getCard().values()){
                totalPoint +=rank.getPoint();
            }
        }
        return totalPoint;
    }
}
