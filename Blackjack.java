public class Blackjack implements Runnable {

    Interface gui = new Interface();


    public static void main (String [] args){

        System.out.println("Welcome to the BSU Casino");

        Deck playDeck = new Deck();
        playDeck.createDeck();
        System.out.println(playDeck);


        new Thread(new Blackjack()).start();

    }

    @Override
    public void run() {

    }
}
