package studio7;

public class Die {
	private int number;
	
	public Die(int n) {
		number = n;
	}
		
	public int roll() {
		return (int)(Math.random() * (number)) + 1;
	}
	
	public static void main(String[] args) {
		Die one = new Die(6);
		System.out.println(one.roll());
	}

}
