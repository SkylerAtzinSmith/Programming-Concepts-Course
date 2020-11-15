//import random class
import java.util.Random;

public class Card {
	
	//initialize class variables suit and face for playing card
	public static int suit = 0;
	public static int face = 0;
	public static String suitString;
	public static String faceString;

	
	//New Random object called rand
	Random rand = new Random();
	
	public Card() {
		
		//Attribute random suit and face to new Card objects 
		suit = rand.nextInt(3) + 1;
		face = rand.nextInt(12) + 1 ;
		
		//convert suit and face values to string values of cards
		switch(suit) {
		case 1: suitString = " of Hearts";
				break;
		case 2: suitString = " of Spades";
				break;
		case 3: suitString = " of Diamonds";
				break;
		case 4: suitString = " of Clubs";
				break;
		}
		
		switch(face) {
		case 1: faceString = "Ace";
				break;
		case 11: faceString = "Jack";
				break;
		case 12: faceString = "Queen";
				break;
		case 13: faceString = "King";
				break;
		default: faceString = Integer.toString(face);
				break;
		}
		
	}
	
	//Creates a toString method to print the face and suit of the card when card is printed
	public String toString() {
		return (Card.faceString + Card.suitString);
	}
	
	//New method called dealFive that deals 5 random cards
	public void dealFive() {
		
		Card card1 = new Card();
		System.out.println(card1);
		Card card2 = new Card();
		System.out.println(card2);
		Card card3 = new Card();
		System.out.println(card3);
		Card card4 = new Card();
		System.out.println(card4);
		Card card5 = new Card();
		System.out.println(card5);
		
	}
	
	
	public static void main(String[] args) {
		
		//creates new Card object called Deck
		Card deck = new Card();
	
		//invokes the dealFive method
		deck.dealFive();
	}
}
