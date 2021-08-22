public class SnakeLadder {

	int value;

	public SnakeLadder() {
		this.value = 0;
	}

	public int getDiceValue() {
		double rand = Math.random();
		this.value = (int) (1 + rand * 6);
		return this.value;
	}
	public static void main(String[] args) {
		SnakeLadder snakeLadder=new SnakeLadder();
		System.out.println("Starting point of game is : "+snakeLadder.value);
		System.out.println("Dice value is : "+snakeLadder.getDiceValue());
	}

}
