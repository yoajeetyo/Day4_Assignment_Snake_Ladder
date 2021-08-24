import java.util.Random;

public class SnakeLadder {
	public static int start;
	public static int initialPosition = 0;

	public SnakeLadder() {
		this.start = 0;
	}

	public int getDiceValue() {
		double rand = Math.random();
		this.start = (int) (1 + rand * 6);
		return this.start;
	}

	public static void main(String[] args) {
		System.out.println("Welcome to game!!!");
		SnakeLadder snakeLadder = new SnakeLadder();
		System.out.println("Starting point of game is : " + initialPosition);
		int diceValue = (int) snakeLadder.getDiceValue();
		System.out.println("Dice value is : " + diceValue);
		while (initialPosition< 100) {
			int options = (int) (1 + Math.random() * 3);
			switch (options) {
			case 1:
				System.out.println("your dice value is : "+diceValue);
				System.out.println("you got Ladder");
				initialPosition += diceValue;
				System.out.println("your value is now increased and current position is : " + initialPosition);
				break;
			case 2:
				if (initialPosition >= start) {
					System.out.println("your dice value is : "+diceValue);
					System.out.println("you got snake");
					initialPosition -= diceValue;
					System.out.println("your value is decreased and your current position is : " + initialPosition);
					break;
				} else {
					System.out.println("your dice value is : "+diceValue);
					System.out.println("you got snake but you are at 0 position");
					System.out.println("your remain at : " + initialPosition + " position");
					break;
				}

			default:
				System.out.println("your dice value is : "+diceValue);
				System.out.println(" But you got no play");
				System.out.println("your remain at : " + initialPosition + " position");
				break;
			}
		}

	}

}
