import java.util.Random;

public class SnakeLadder {
	
	int startPosition;
public SnakeLadder(int value) {
		super();
		this.startPosition = value;
	}
public static void main(String[] args) {
		SnakeLadder snakeLadder = new SnakeLadder(0);
		System.out.println("Start position of the player is : "+snakeLadder.startPosition);
		
	}
	
	
}
