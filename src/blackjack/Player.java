package blackjack;

import java.util.ArrayList;

public class Player {
	public static void getCard(int playerScore, ArrayList<Card> playerCard) {
		int a = 0;

		do {
			System.out.print(PrintMessage.ADDCARD);

			Main.inpNum = Main.scan.nextInt();

			if (Main.inpNum == PrintMessage.YES) {
				playerCard.add((Card) CardDeck.extCard());
				a = printCard(playerScore, playerCard);

			} else if (Main.inpNum == PrintMessage.NO) {
				break;

			} else  {
				System.out.println(PrintMessage.RIGHTANS);
			}

		} while (a <= 21);
		
	}

	public static int printCard(int playerScore, ArrayList<Card> playerCard) {
		for (Card a : playerCard) {
			playerScore += a.retScore();
			System.out.println(a);
		}
		System.out.println(playerScore);

		return playerScore;
	}

	public static void playerScore() {
		Player p = new Player() ;
		
		}
	}
	
