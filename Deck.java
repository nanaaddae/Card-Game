import java.util.ArrayList;
import java.util.Random;

public class Deck {

private ArrayList<Card> cards;

    //constructor for the deck
    public Deck(){
        this.cards = new ArrayList<Card>();
    }

    //adding cards to the deck
    public void createDeck(){

        //Make cards for each suit
        for(Suit cardSuit : Suit.values()){
            for(Value cardValue : Value.values()){

                //Adds new cards
                this.cards.add(new Card(cardSuit,cardValue));

            }
        }
    }

    public String toString(){

        String cardOut = " ";
        int i = 0;

        //Make a string with all the card values
        for(Card aCard : this.cards){
            cardOut += "\n" + i + "-" + aCard.toString();
            i++;
        }

        return cardOut;
    }

    //Shuffles the cards around using temp deck
    public void shufDeck(){
        ArrayList<Card>tempDeck = new ArrayList<Card>();

        Random random = new Random();
        int randomCard = 0;
        int orgSize = this.cards.size();
    }

}
