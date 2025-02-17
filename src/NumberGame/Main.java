package NumberGame;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		int attempt = 1;
		int userGuessNumber = 0;
		int secretNumber = (int) (Math.random() * 100);
		Scanner userInput = new Scanner(System.in);
		System.out.println("Welcome to Guess Number Game \nYou Will Be Asked To Guess A Number To Win The Game \nYou have Maximum 10 Attemp Limit");
		do {
			System.out.print("Enter a guess number between 1 to 100\n");
			if (userInput.hasNextInt()) {
				userGuessNumber = userInput.nextInt();
				if (userGuessNumber == secretNumber) {
					System.out.println("OOhhOO!, Your Number is Correct. You Win the Game!");
					break;
				} else if (userGuessNumber < secretNumber)
					System.out.println("Your Guess Number is Smaller.");
				else if (userGuessNumber > secretNumber)
					System.out.println("Your Guess Number is Greater.");
				if (attempt == 10) {
					System.out.println("You have exceeded the maximum attempt. Try Again");
					break;
				}
				attempt++;
			} else {
				System.out.println("Enter a Valid Integer");
				break;
			}
		} while (userGuessNumber != secretNumber);

	}

}
