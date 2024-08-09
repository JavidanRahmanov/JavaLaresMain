//package Tasks.lesson16.entertaining;
//
//import javax.print.attribute.standard.PresentationDirection;
//import java.util.ArrayList;
//import java.util.EnumMap;
//import java.util.Random;
//
//public class Deck {
//
////   private enum cardSuits {
////
////       private static final Random  = new Random();
////       public static cardSuits randomCardsuits(){
////           cardSuits[] cardSuits = values();
////           return cardSuits[]
////       }
////   }
//
//    public void getRandomSuit() {
//        Random random = new Random();
//        int index = random.nextInt(0, 3);
//        Suit suit = Suit.values()[index];
//        int point = suit.getPoint();
//    }
//   private enum cardRanks {DEUCE,THREE,FOUR,FIVE,SIX,SEVEN,EIGHT,NINE,TEN,JACK,QUEEN,KING,ACE};
//
//   private ArrayList<Card> deck;
//
//    public Deck() {
//        this.deck = new ArrayList<>() ;
//    }
//
//    public void populateDeck() {
//        Random rnd = new Random();
//        int times = 0;
//        while (times < 6) {
//
//            Card card = new Card(cardSuits[randomSuitIndex], cardRanks[randomRankIndex]);
//            deck.add(card);
//            times++;
//        }
//    }
//
//    public void getCards(){
//        for(Card card: deck){
//            System.out.println(card);
//        }
//    }
//
//
//}
