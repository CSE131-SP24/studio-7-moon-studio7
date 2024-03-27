package studio7;

public class Fraction {
	
	private int numerator;
	private int denominator;
	
	public Fraction(int n, int d) {
		numerator = n;
		denominator = d;
	}
	public Fraction reciprocal() {
		int recipNum = denominator;
		int recipDen = numerator;
		return new Fraction(recipDen, recipNum);
	}
	public Fraction add(Fraction F) {
		int multiplyNum = numerator * F.getDen() + denominator * F.getNum();
		int multiplyDen = denominator * F.getDen();
		return new Fraction(multiplyNum, multiplyDen);
	}
	public Fraction multiply(Fraction F) {
		int newNum = numerator * F.getNum();
		int newDen = denominator * F.getDen();
		return new Fraction(newNum, newDen);
	}
	public int getNum() {
		return this.numerator;
	}
	public int getDen() {
		return this.denominator;
	}
	public static void main(String[] args) {
		Fraction one = new Fraction(2, 5);
		Fraction two = new Fraction(3,7);
		System.out.println(one.add(two));
		System.out.println(one.multiply(two));
		System.out.println(one.reciprocal());
	}

}
