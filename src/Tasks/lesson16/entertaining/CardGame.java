package Tasks.lesson16.entertaining;


public class CardGame {

    public static void main(String[] args) {

        Deck deck1 = new Deck();
        Deck deck2 = new Deck();

        deck1.populateCards(deck1);
        deck2.populateCards(deck2);

        deck1.shuffleDeck();
        deck2.shuffleDeck();

        Player player1 = new Player("Cavidan", deck1);
        Player player2 = new Player("Perviz", deck2);

        int player1Points = player1.getDeck().calculateTotalPoint();
        int player2Points = player2.getDeck().calculateTotalPoint();

        if (player1Points > player2Points)
            System.out.println(player1.getName() + " won! his total point: " + player1Points);
        else if (player2Points > player1Points)
            System.out.println(player2.getName() + " won! his total point: " + player2Points);
        else
            System.out.println("Draw! their total points: "+ player1Points);


    }
}
