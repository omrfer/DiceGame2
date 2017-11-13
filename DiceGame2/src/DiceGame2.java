import java.util.Scanner;

public class DiceGame2 {
// Author @ Omar Fernandez
	public static void main(String[] args) {
				int games = 0, numberofdice, x = 1, guess, dicetotal;
				String repeat, result;
				Scanner input = new Scanner(System.in);
				DiceHW abc = new DiceHW();
				System.out.println("Let's play a dice game.");
				do {
					games++;
					System.out.println("How many dice would you like to roll?");
					numberofdice = input.nextInt();
					
					abc.SetNumberofDice(numberofdice);
					abc.AddtoDiceThrownHistory( numberofdice);
			//		abc.ReturnDiceThrownHistory(games-1);
					abc.Diceroll();
					dicetotal = abc.ReturnDiceTotal();
				//	System.out.println(dicetotal);
					abc.AddtoDiceTotalHistory(dicetotal);
				//	abc.ReturnDiceTotalHistory(games-1);
					System.out.println("What do you think the number is?");
					guess = input.nextInt();
					abc.AddtoNumberGuess(guess);
					System.out.println(guess);
					if (guess == abc.ReturnDiceTotal()) {
						result = "win";
						abc.AddtoGameResultHistory(result);
						System.out.println("Correct");
					} else {
						result = "loss";
						abc.AddtoGameResultHistory(result);
						System.out.println("Incorrect");
					}
					System.out.println("Game History");

					for (int i = 0; i < games; i++) {
						System.out.printf("For game %d.The amount of dice rolled was %d and the total was %d.%n",
								i+1,abc.ReturnDiceThrownHistory(i),abc.ReturnDiceTotalHistory(i));
						System.out.printf("Your guess was %d so the game was a %s.%n",
								abc.ReturnNumberGuessHistory(i),abc.ReturnGameResultHistory(i));	
					}
					System.out.println("Would you like to keep playing? Enter Y or yes to continue.");
					repeat = input.next();
					if (repeat.equalsIgnoreCase("Y") || repeat.equalsIgnoreCase("yes")) {
						x = 2;

					} else {
						System.out.println("Goodbye.");
					}

				} while (x == 2);
			}
		

	}


