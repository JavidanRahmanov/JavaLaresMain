package Tasks.lesson16.entertaining;

public class Player {

    private String name;
    private Deck deck;
    private static int count;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Deck getDeck() {
        return deck;
    }

    public void setDeck(Deck deck) {
        this.deck = deck;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Player.count = count;
    }

    public Player(String name, Deck deck) {
        this.name = name;
        this.deck = deck;
        count++;
    }
}
