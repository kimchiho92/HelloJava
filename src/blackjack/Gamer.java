package blackjack;

import java.util.ArrayList;

public class Gamer extends Player { 
    public static ArrayList<Card> gamerCard = new ArrayList<Card>(); // gamer가 가지고 있는 카드_배열 
    public static int gamerScore; 
     
    public static void gamerGame() { 
     System.out.println(PrintMessage.PLAYER); 
     Player.printCard(gamerScore, gamerCard); 

     Player.getCard(gamerScore, gamerCard);

}
}
