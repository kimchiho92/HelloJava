package blackjack;

import java.util.Scanner;

public class Main {
	 public static Scanner scan = new Scanner(System.in); 
	   public static int inpNum; 
	  
	  
	  public static void main(String[] args) { 
	   
	    CardDeck.makeCard(); // 카드 52장 생성 
	     
	    int startNum= 2;  
	   for (int i=0; i< startNum; i++) { // 카드 1장씩 게이머와 딜러에게 번갈아 2번 줌 
	     Gamer.gamerCard.add((Card)CardDeck.extCard()); 
	     Dealer.dealerCard.add((Card)CardDeck.extCard()); 
	    } 
	     
	    System.out.println(PrintMessage.DEALERFIRSTCARD); // 딜러의 첫 번째 카드 출력 
	    System.out.println(Dealer.dealerCard.get(0));  // 딜러의 첫 번재 카드 가져옴 
	    System.out.println(); // 줄 바꿈 
	    Gamer.gamerGame();  // 게이머부터 카드를 뽑는다. 
	    System.out.println(); // 줄 바꿈 
	     System.out.println("==========");
	    Dealer.dealerGame(); 
	    
	    Player.playerScore();
	    	
	    
	    	}
	    }


	   

