package blackjack;

import java.util.ArrayList;

public class Dealer extends Player { 
	   public static ArrayList<Card> dealerCard = new ArrayList<Card>(); // dealer가 가지고 있는 카드_배열 
	    public static int dealerScore; 
	     
	    public static void dealerGame() { 
	     System.out.println(PrintMessage.DEALER); 
	     Player.printCard(dealerScore, dealerCard); 
	     Player.getCard(dealerScore, dealerCard); 
	    } 
}
